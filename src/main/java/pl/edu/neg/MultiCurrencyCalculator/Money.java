package pl.edu.neg.MultiCurrencyCalculator;

public abstract class Money {

    protected int amount;
    public String currencyId;
    public double exchangeToPLN;

    public Money() {
    }

    public Money(int amount) {
        this.amount = amount;
    }

    public Money(int amount, String currencyId, double exchange) {
        this.amount = amount;
        this.currencyId = currencyId;
        this.exchangeToPLN = exchange;
    }

    int times(int multiplier){
        return this.amount *= multiplier;
    }

    public boolean equals(Object object) {
        Money tempMoney = (Money) object;
        // return this.amount == tempMoney.amount && getClass() == object.getClass();
        return this.amount == tempMoney.amount
                && this.currencyId == tempMoney.currencyId
                && this.exchangeToPLN == tempMoney.exchangeToPLN
                && getClass().equals(object.getClass());
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currencyId='" + currencyId + '\'' +
                ", exchangeToPLN=" + exchangeToPLN +
                '}';
    }
}
