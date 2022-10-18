import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;

public class CreditCard extends BankCard{
    double availableCredit;
    ArrayList<String> transactionLog;

    public CreditCard(int cardNumber, int expiryDate, int securityNumber, double availableCredit) {
        super(cardNumber, expiryDate, securityNumber);
        this.availableCredit = availableCredit;
        this.transactionLog = new ArrayList<>();
    }

    public double getAvailableCredit() {
        return availableCredit;
    }

    public void charge(double amount){
        double adjustedAmount = amount * 1.25;
        transactionLog.add(adjustedAmount + " spent");
        this.availableCredit -= adjustedAmount;
    }

    public ArrayList<String> getTransactionLog(){
        return this.transactionLog;
    }

}
