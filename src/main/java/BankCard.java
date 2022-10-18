public abstract class BankCard implements IChargeable {
    int cardNumber;
    int expiryDate;
    int securityNumber;

    public BankCard(int cardNumber, int expiryDate, int securityNumber) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }


}
