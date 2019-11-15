package com.greatwideweb.springsandbox.currency;

public class Franc extends Money {

    public Franc(int i) {
        super(i);
    }

    public Money times(int i) {
        return new Franc(getAmount() * i);
    }
}
