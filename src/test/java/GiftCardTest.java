import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before(){
        giftCard = new GiftCard(420);
    }

    @Test
    public void giftCardHasBalance() {
        assertEquals(420, giftCard.getBalance(), 0.0);
    }

    @Test
    public void giftCardCanChangeBalance() {
        giftCard.setBalance(69);
        assertEquals(69, giftCard.getBalance() ,0.0);
    }

    @Test
    public void giftCardCanBeCharged() {
        giftCard.charge(419.31);
        assertEquals(0.69, giftCard.getBalance(),0.1);
    }
}

