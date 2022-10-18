public class DebitCard extends BankCard {
    int accountNumber;
    int sortCode;

    double balance;

    public DebitCard(int cardNumber, int expiryDate, int securityNumber, int accountNumber, int sortCode, double balance) {
        super(cardNumber, expiryDate, securityNumber);
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public int getSortCode() {
        return sortCode;
    }

    public double getBalance() {
        return balance;
    }

    public void charge(double amount) {
        this.balance -= amount;

    }
}

