import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WalletTest {
    Wallet wallet;
    GiftCard giftCard;

    CreditCard creditCard;
    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(1234, 1, 2,3, 4, 42069);
        creditCard = new CreditCard(1234, 1, 2,42069);
        giftCard = new GiftCard(420.69);
        wallet = new Wallet();

    }

    @Test
    public void walletStartsWithNoSelectedPaymentMethod() {
        assertEquals(null, wallet.getSelectedPaymentMethod());
    }

    @Test
    public void walletStartsWithNoPaymentMethods() {
        assertEquals(0, wallet.getPaymentMethods().size());
    }

    @Test
    public void walletCanAddPaymentMethod() {
        wallet.addPaymentMethod(giftCard);
        assertEquals(1, wallet.getPaymentMethods().size());
    }

    @Test
    public void walletCanSelectPaymentMethod() {
        wallet.addPaymentMethod(giftCard);
        wallet.SelectPaymentMethod(0);
        assertEquals(giftCard, wallet.getSelectedPaymentMethod());
    }

    @Test
    public void walletCanPayUsingSelectedPaymentMethod() {
        wallet.addPaymentMethod(giftCard);
        wallet.SelectPaymentMethod(0);
        wallet.makePayment(420);
        assertEquals(0.69, giftCard.getBalance(), 0.1);
    }

    @Test
    public void walletCanPayUsingSelectedPaymentMethodsCompositeTest() {
        wallet.addPaymentMethod(giftCard);
        wallet.SelectPaymentMethod(0);
        wallet.makePayment(420);
        wallet.addPaymentMethod(creditCard);
        wallet.SelectPaymentMethod(1);
        wallet.makePayment(420);
        wallet.addPaymentMethod(debitCard);
        wallet.SelectPaymentMethod(2);
        wallet.makePayment(420);
        assertEquals(0.69, giftCard.getBalance(), 0.1);
        assertEquals(41649, debitCard.getBalance(), 0.1);
        assertEquals(41544, creditCard.getAvailableCredit(), 0.1);

    }
}
