package uts.isd.model;

public class SavedTrip {

    private int tripId;            // Unique identifier for each saved trip
    private int accountId;         // Foreign key linking the trip to a user account
    private String tripName;       // User-defined name for the saved trip (e.g., "Home to Work")
    private String currentLocation;  // Starting point of the trip (e.g., "Central Station")
    private String destinationLocation;  // Destination point of the trip (e.g., "Town Hall")

    // Constructor
    public SavedTrip(int tripId, int accountId, String tripName, String currentLocation, String destinationLocation) {
        this.tripId = tripId;
        this.accountId = accountId;
        this.tripName = tripName;
        this.currentLocation = currentLocation;
        this.destinationLocation = destinationLocation;
    }

    // Getters
    public int getTripId() {
        return tripId;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getTripName() {
        return tripName;
    }

    public String getCurrentLocation() {
        return currentLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    // Setters
    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setTripName(String tripName) {
        this.tripName = tripName;
    }

    public void setCurrentLocation(String currentLocation) {
        this.currentLocation = currentLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }
}
