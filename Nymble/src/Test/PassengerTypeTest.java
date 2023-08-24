package Test;

import main.PassengerType;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PassengerTypeTest {

    @Test
    public void testApplyDiscount() {
        PassengerType standard = new PassengerType("Standard", 0.0);
        PassengerType gold = new PassengerType("Gold", 0.10);

        assertEquals(100.0, standard.applyDiscount(100.0), 0.001);
        assertEquals(90.0, gold.applyDiscount(100.0), 0.001);
    }
}
