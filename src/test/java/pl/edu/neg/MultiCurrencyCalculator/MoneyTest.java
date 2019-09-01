package pl.edu.neg.MultiCurrencyCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyTest {

    @Test
    void testMultiplicationDollar() {
        Money product1 = Money.dollar(2);
        Money product2 = Money.dollar(1);

        product1.times(2);
        assertEquals(Money.dollar(4),product1);

        product2.times(3);
        assertEquals(Money.dollar(3),product2);

        Money product3 = Money.dollar(product2.times(3).amount);
        assertEquals(Money.dollar(9),product3);
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5),Money.dollar(5));
        assertNotEquals(Money.dollar(5),Money.dollar(8));
    }

    @Test
    void testMultiplicationFranc() {
        Money product1 = Money.franc(2);
        Money product2 = Money.franc(1);

        product1.times(2);
        assertEquals(Money.franc(4),product1);

        product2.times(3);
        assertEquals(Money.franc(3),product2);

        Money product3 = Money.franc(product2.times(3).amount);
        assertEquals(Money.franc(9),product3);
    }

    @Test
    void EqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
    }

    @Test
    void FrancAndDollarShouldBeNotEqual() {
        assertNotEquals(Money.franc(5), Money.dollar(5));
    }

    @Test
    void checkGettingCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    void testSimpleAdditionTwoToBasket() {
        Money basket = Money.dollar(5);
        Expression sum = basket.plus(basket);
        Bank bank = new Bank();
        Money reducedBasket = bank.reduce(sum,"USD");
        assertEquals(Money.dollar(10),reducedBasket);
    }

    @Test
    void testValuesInAugendAndAddend() {
        Money five = Money.dollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augend);
        assertEquals(five, sum.addend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.dollar(3), Money.dollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(7), result);
    }

    @Test
    void testReduceMoney() {
        Bank bank = new Bank();
        Money result = bank.reduce(Money.dollar(1), "USD");
        assertEquals(Money.dollar(1), result);
    }
}
