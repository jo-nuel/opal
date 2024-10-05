package uts.isd.model.dao;

import uts.isd.model.SavedTrip;
import java.sql.*;
import java.util.ArrayList;

public class SavedTripDAO {
    private Connection conn;
    private PreparedStatement readSt;
    private String readQuery = "SELECT * FROM SavedTrips WHERE accountId = ?";

    public SavedTripDAO(Connection conn) throws SQLException {
        this.conn = conn;
        conn.setAutoCommit(true);
        readSt = conn.prepareStatement(readQuery);
    }

    // Add a new saved trip
    public void addSavedTrip(String tripName, String currentLocation, String destinationLocation, int accountId) throws SQLException {
        String sql = "INSERT INTO SavedTrips (tripName, currentLocation, destinationLocation, accountId) VALUES (?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, tripName);
        st.setString(2, currentLocation);
        st.setString(3, destinationLocation);
        st.setInt(4, accountId);
        st.executeUpdate();
    }

    // Update an existing saved trip
    public void updateSavedTrip(int tripId, String tripName, String currentLocation, String destinationLocation) throws SQLException {
        String sql = "UPDATE SavedTrips SET tripName=?, currentLocation=?, destinationLocation=? WHERE tripID=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, tripName);
        st.setString(2, currentLocation);
        st.setString(3, destinationLocation);
        st.setInt(4, tripId);
        st.executeUpdate();
    }

    // Find a saved trip by trip ID
    public SavedTrip findSavedTrip(int tripId) throws SQLException {
        String sql = "SELECT * FROM SavedTrips WHERE tripID = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, tripId);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            String tripName = rs.getString("tripName");
            String currentLocation = rs.getString("currentLocation");
            String destinationLocation = rs.getString("destinationLocation");
            int accountId = rs.getInt("accountId");

            return new SavedTrip(tripId, accountId, tripName, currentLocation, destinationLocation);
        }
        return null;
    }

    // List all saved trips for a user (by accountId)
    public ArrayList<SavedTrip> listAllTripsByAccountId(int accountId) throws SQLException {
        ArrayList<SavedTrip> trips = new ArrayList<>();
        readSt.setInt(1, accountId);
        ResultSet rs = readSt.executeQuery();

        while (rs.next()) {
            int tripId = rs.getInt("tripID");
            String tripName = rs.getString("tripName");
            String currentLocation = rs.getString("currentLocation");
            String destinationLocation = rs.getString("destinationLocation");

            trips.add(new SavedTrip(tripId, accountId, tripName, currentLocation, destinationLocation));
        }
        return trips;
    }

    // Delete a saved trip by tripId
    public void deleteSavedTrip(int tripId) throws SQLException {
        String sql = "DELETE FROM SavedTrips WHERE tripID = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, tripId);
        st.executeUpdate();
    }

    // Method to get saved trips by accountId
    public ArrayList<SavedTrip> getTripsByAccountId(int accountId) throws SQLException {
        ArrayList<SavedTrip> trips = new ArrayList<>();
        String query = "SELECT * FROM SavedTrips WHERE accountId = ?";

        try (PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, accountId);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                int tripId = rs.getInt("tripId");
                String tripName = rs.getString("tripName");
                String currentLocation = rs.getString("currentLocation");
                String destinationLocation = rs.getString("destinationLocation");

                // Create SavedTrip object and add it to the list
                SavedTrip trip = new SavedTrip(tripId, accountId, tripName, currentLocation, destinationLocation);
                trips.add(trip);
            }
        }
        return trips;
    }
}
