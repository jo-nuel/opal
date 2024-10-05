package uts.isd.model;

public class OpalCard {

    // Enum to define the card status
    public enum CardStatus {
        ACTIVE, DISABLED
    }

    private int cardId;      // Unique identifier for each Opal card
    private String cardNumber;  // Card number on the physical Opal card
    private String cardName;  // Custom name assigned to the card by the user
    private double balance;   // Current balance on the card
    private int accountId;    // Foreign key to link the card to a user account
    private CardStatus cardStatus;  // Status of the card (active, disabled)

    // Constructor
    public OpalCard(int cardId, String cardNumber, String cardName, double balance, int accountId, CardStatus cardStatus) {
        this.cardId = cardId;
        this.cardNumber = cardNumber;
        this.cardName = cardName;
        this.balance = balance;
        this.accountId = accountId;
        this.cardStatus = cardStatus;
    }

    // Getters
    public int getCardId() {
        return cardId;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCardName() {
        return cardName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountId() {
        return accountId;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    // Setters
    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
