public class GiftCard implements IChargeable{

    private double balance;

    public GiftCard(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void charge(double amount){
        this.balance -= amount;
    }
}
