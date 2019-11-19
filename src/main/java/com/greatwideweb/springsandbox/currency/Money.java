package com.greatwideweb.springsandbox.currency;

public class Money implements Expression {

    public static final String USD = "USD";
    public static final String CHF = "CHF";
    private int amount;
    private String currency;

    public String currency() {
     return currency;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public Money reduce(Bank bank, String to) {
        return new Money(amount / bank.rate(this.currency, to), to);
    }

    public Money(int newAmount, String newCurrency) {
        amount = newAmount;
        currency = newCurrency;
    }

    @Override
    public Expression times(int i) {
        return new Money(this.amount * i, this.currency);
    }

    public static Money dollar(int i) {
        return new Money(i, USD);
    }
    public static Money franc(int i) {
        return new Money(i, CHF);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && currency == money.currency;
    }

    @Override
    public int hashCode() {
        return amount;
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }
}
