package com.greatwideweb.springsandbox.currency;

import java.util.Objects;

public class Dollar extends Money {

    public Dollar(int i) { super(i); }

    public Money times(int i) {
        return new Dollar(getAmount() *  i);
    }
}
