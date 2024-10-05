package uts.isd.model.dao;

import uts.isd.model.OpalCard;
import java.sql.*;
import java.util.ArrayList;

public class OpalCardDAO {
    private Connection conn;
    private PreparedStatement readSt;
    private String readQuery = "SELECT * FROM OpalCard WHERE accountId = ?";

    public OpalCardDAO(Connection conn) throws SQLException {
        this.conn = conn;
        conn.setAutoCommit(true);
        readSt = conn.prepareStatement(readQuery);
    }

    // Add a new Opal card
    public void addOpalCard(String cardNumber, String cardName, double balance, int accountId, OpalCard.CardStatus cardStatus) throws SQLException {
        String sql = "INSERT INTO OpalCard (cardNumber, cardName, balance, accountId, cardStatus) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, cardNumber);
        st.setString(2, cardName);
        st.setDouble(3, balance);
        st.setInt(4, accountId);
        st.setString(5, cardStatus.name());  // Enum converted to string
        st.executeUpdate();
    }

    // Update an existing Opal card
    public void updateOpalCard(int cardId, String cardName, double balance, OpalCard.CardStatus cardStatus) throws SQLException {
        String sql = "UPDATE OpalCard SET cardName=?, balance=?, cardStatus=? WHERE cardID=?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setString(1, cardName);
        st.setDouble(2, balance);
        st.setString(3, cardStatus.name());
        st.setInt(4, cardId);
        st.executeUpdate();
    }

    // Find a single Opal card by card ID
    public OpalCard findOpalCard(int cardId) throws SQLException {
        String sql = "SELECT * FROM OpalCard WHERE cardID = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, cardId);
        ResultSet rs = st.executeQuery();

        if (rs.next()) {
            String cardNumber = rs.getString("cardNumber");
            String cardName = rs.getString("cardName");
            double balance = rs.getDouble("balance");
            String cardStatus = rs.getString("cardStatus");
            int accountId = rs.getInt("accountId");

            return new OpalCard(cardId, cardNumber, cardName, balance, accountId, OpalCard.CardStatus.valueOf(cardStatus));
        }
        return null;
    }

    // List all Opal cards for a user (by accountId)
    public ArrayList<OpalCard> listAllCardsByAccountId(int accountId) throws SQLException {
        ArrayList<OpalCard> cards = new ArrayList<>();
        readSt.setInt(1, accountId);
        ResultSet rs = readSt.executeQuery();

        while (rs.next()) {
            int cardId = rs.getInt("cardID");
            String cardNumber = rs.getString("cardNumber");
            String cardName = rs.getString("cardName");
            double balance = rs.getDouble("balance");
            String cardStatus = rs.getString("cardStatus");

            cards.add(new OpalCard(cardId, cardNumber, cardName, balance, accountId, OpalCard.CardStatus.valueOf(cardStatus)));
        }
        return cards;
    }

    // Delete an Opal card by cardId
    public void deleteOpalCard(int cardId) throws SQLException {
        String sql = "DELETE FROM OpalCard WHERE cardID = ?";
        PreparedStatement st = conn.prepareStatement(sql);
        st.setInt(1, cardId);
        st.executeUpdate();
    }
}
