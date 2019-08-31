package pl.edu.neg.MultiCurrencyCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Dollar product1 = new Dollar(2);
        Dollar product2 = new Dollar(1);

        product1.times(2);
        assertEquals(new Dollar(4),product1);

        product2.times(3);
        assertEquals(new Dollar(3),product2);

        Dollar product3 = new Dollar(product2.times(3));
        assertEquals(new Dollar(9),product3);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(new Dollar(5), new Dollar(5));
        assertNotEquals(new Dollar(5), new Dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
        Franc product1 = new Franc(2);
        Franc product2 = new Franc(1);

        product1.times(2);
        assertEquals(new Franc(4),product1);

        product2.times(3);
        assertEquals(new Franc(3),product2);

        Franc product3 = new Franc(product2.times(3));
        assertEquals(new Franc(9),product3);
    }

    @Test
    void EqualityFranc() {
        assertEquals(new Franc(5), new Franc(5));
        assertNotEquals(new Franc(5), new Franc(8));
    }

    @Test
    void FrancAndDollarShouldBeNotEqual() {
        assertNotEquals(new Franc(5), new Dollar(5));
    }

    @Test
    void checkCurrencyIds() {
        assertEquals("USD", new Dollar(1).currencyId);
        assertEquals("CHF", new Franc(1).currencyId);
    }

    @Test
    void checkExchange() {

    }
}
