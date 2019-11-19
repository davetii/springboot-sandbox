package com.greatwideweb.springsandbox.testing;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreeterTest {

    private Greeter g;
    private static String BOB;

    @BeforeAll
    public static void beforeClass() {
        BOB = "Bob";
    }

    @BeforeEach
    void setUp() {
        g = new Greeter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void helloWorld() {
        assertEquals(g.helloWorld(), "Hello World");
    }

    @Test
    void testHelloWorld() {
        assertEquals(g.helloWorld("Bob"), "Hello " + BOB);
    }
}