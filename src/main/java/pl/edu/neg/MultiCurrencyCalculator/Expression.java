package pl.edu.neg.MultiCurrencyCalculator;

public interface Expression {
    Money reduce(String to);
}
