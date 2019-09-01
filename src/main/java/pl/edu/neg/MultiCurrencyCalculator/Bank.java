package pl.edu.neg.MultiCurrencyCalculator;

public class Bank {

    Money reduce(Expression source, String toCurrency) {
        return source.reduce(toCurrency);
    }
}
