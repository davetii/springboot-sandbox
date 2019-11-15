package com.greatwideweb.springsandbox.currency;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MoneyUnitTest {

    @Test
    public void testMultiplicationDollar() {
        assertEquals(Money.dollar(10),  Money.dollar(5).times(2));
        assertEquals(Money.dollar(15), Money.dollar(5).times(3));
    }

    @Test
    void testEqualityDollar() {
        assertEquals(Money.dollar(5), Money.dollar(5));
        assertNotEquals(Money.dollar(5), Money.dollar(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }

    @Test
    public void testMultiplicationFranc() {
        assertEquals(Money.franc(10), Money.franc(5).times(2));
        assertEquals(Money.franc(15), Money.franc(5).times(3));
    }

    @Test
    void testEqualityFranc() {
        assertEquals(Money.franc(5), Money.franc(5));
        assertNotEquals(Money.franc(5), Money.franc(8));
        assertNotEquals(Money.dollar(5), Money.franc(5));
    }
}
