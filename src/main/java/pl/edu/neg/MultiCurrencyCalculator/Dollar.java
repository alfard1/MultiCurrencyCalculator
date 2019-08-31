package pl.edu.neg.MultiCurrencyCalculator;

public class Dollar extends Money {


    public Dollar(int amount) {

        this.amount = amount;
        this.currencyId = "USD";
        this.exchangeToPLN = 4.12;
    }
}
