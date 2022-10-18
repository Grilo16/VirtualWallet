import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {
    CreditCard creditCard;

    @Before
    public void before() {
        creditCard = new CreditCard(1234, 1, 2,420);
    }

    @Test
    public void creditCardHasCardNumber() {
        assertEquals(1234, creditCard.getCardNumber());
    }

    @Test
    public void creditCardHasExpiryDate() {
        assertEquals(1, creditCard.getExpiryDate());
    }

    @Test
    public void creditCardHasSecurityNumber() {
        assertEquals(2, creditCard.getSecurityNumber());
    }

    @Test
    public void creditCardHasAvailableCredit() {
        assertEquals(420, creditCard.getAvailableCredit(), 0.0);
    }

    @Test
    public void creditCardCanBeCharged() {
        creditCard.charge(100);
        assertEquals(295, creditCard.getAvailableCredit(),0.1);
    }

    @Test
    public void creditCardLogsTransactions() {
        creditCard.charge(100);
        creditCard.charge(20);
        assertEquals("25.0 spent", creditCard.getTransactionLog().get(1));
    }
}
