package com.greatwideweb.springsandbox.gametime;

import static java.lang.Thread.sleep;

public class Player {

    private final String id;
    private final String firstName;
    private final String lastName;

    public Player(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String anExpectedError() {
        throw new PlayerRuntimeException();
    }

    public String longRunningMethod() {
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello from a long running thread";
    }
}
