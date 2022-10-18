import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {
    DebitCard debitCard;

    @Before
    public void before() {
        debitCard = new DebitCard(1234, 1, 2,3, 4, 42069);

    }


    @Test
    public void debitCardHasCardNumber() {
        assertEquals(1234, debitCard.getCardNumber());
    }

    @Test
    public void debitCardHasExpiryDate() {
        assertEquals(1, debitCard.getExpiryDate());
    }

    @Test
    public void debitCardHasSecurityNumber() {
        assertEquals(2, debitCard.getSecurityNumber());
    }

    @Test
    public void debitCardHasAccountNumber() {
        assertEquals(3, debitCard.getAccountNumber());
    }


    @Test
    public void debitCardHasSortCode() {
        assertEquals(4, debitCard.getSortCode());
    }

    @Test
    public void debitCardHasBalance() {
        assertEquals(42069, debitCard.getBalance(),0.0);
    }

    @Test
    public void debitCardCanBeCharged() {
        debitCard.charge(100);
        assertEquals(41969, debitCard.getBalance(),0.1);
    }



}
