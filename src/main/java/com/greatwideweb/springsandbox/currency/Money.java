package com.greatwideweb.springsandbox.currency;

public abstract class Money {

    private int amount;

    public Money(int i) {
        amount = i;
    }

    public abstract Money times(int i);

    public int getAmount() {
        return amount;
    }

    public static Money dollar(int i) { return new Dollar(i); }
    public static Money franc(int i) { return new Franc(i); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount;
    }

    @Override
    public int hashCode() {
        return amount;
    }
}
