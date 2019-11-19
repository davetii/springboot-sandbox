package com.greatwideweb.springsandbox.testing;

public class Greeter {
    private static final String HELLO = "Hello";
    private static final String WORLD = "World";

    public String helloWorld() { return HELLO + " " + WORLD; }
    public String helloWorld(String name) { return HELLO + " " + name; }
}
