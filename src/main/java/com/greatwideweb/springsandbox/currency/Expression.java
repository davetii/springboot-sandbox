package com.greatwideweb.springsandbox.currency;

public interface Expression {

    Money reduce(Bank bank, String to);
    Expression plus(Expression addend);
    int getAmount();
    Expression times(int i);
}
