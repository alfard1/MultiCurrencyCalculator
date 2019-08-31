package pl.edu.neg.MultiCurrencyCalculator;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
        this.currencyId = "CHF";
        this.exchangeToPLN = 6.82;
    }



}
