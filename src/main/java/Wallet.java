import jdk.nashorn.api.scripting.ScriptObjectMirror;

import java.util.ArrayList;

public class Wallet {


    private ArrayList<IChargeable> paymentMethods;
    private IChargeable selectedPaymentMethod;

    public Wallet(){

        this.paymentMethods = new ArrayList<>();
        this.selectedPaymentMethod = null;

    }

    public ArrayList<IChargeable> getPaymentMethods() {
        return paymentMethods;
    }

    public void SelectPaymentMethod(int index) {
        this.selectedPaymentMethod = paymentMethods.get(index);
    }

    public IChargeable getSelectedPaymentMethod() {
        return selectedPaymentMethod;
    }

    public void addPaymentMethod(IChargeable paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }

    public void makePayment(double amount) {
        this.selectedPaymentMethod.charge(amount);
    }
}

