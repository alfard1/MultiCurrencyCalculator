package pl.edu.neg.MultiCurrencyCalculator;

public class Money implements Expression {

    protected int amount;
    public String currency;
    //public double exchangeToPLN;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    protected String currency() {
        return currency;
    }

    public static Money dollar(int amount){
        return new Money(amount, "USD");
    }

    public static Money franc(int amount){
        return new Money(amount, "CHF");
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount
                && this.currency == money.currency;
    }

    @Override
    public Money reduce(String to) {
        return this;
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    public Money times(int multiplier){
        return new Money(this.amount *= multiplier, this.currency);
    }

    public Expression plus(Money addend) {
        return new Sum(this, addend);
    }
}
