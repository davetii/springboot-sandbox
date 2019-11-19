package com.greatwideweb.springsandbox.gametime;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public interface PlayerTestBase {

    @BeforeAll
    default void beforeClass() {
        System.out.println("beforeClass from PlayerTestBase");
    }
}
