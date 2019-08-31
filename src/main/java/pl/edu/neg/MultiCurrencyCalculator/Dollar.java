package pl.edu.neg.MultiCurrencyCalculator;

public class Dollar {

    int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multipler){
        amount *= multipler;
    }
}
