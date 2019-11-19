package com.greatwideweb.springsandbox.gametime;

import org.junit.jupiter.api.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest implements PlayerTestBase{

    Player p;

    @BeforeEach
    void setUp() {
        p = new Player("2323", "Andre", "Drummond");
    }



    @DisplayName("Ensure Constructor returns expected")
    @Test
    void groupAssertPlayer() {
        assertAll("Testing constructor",
                () -> assertEquals(p.getFirstName(), "Andre", "First Name Failed"),
                () -> assertEquals(p.getLastName(), "Drummond", "Last Name Failed"),
                () -> assertEquals(p.getId(), "2323", "ID failed")
        );
    }

    @Disabled("Demonstrates prettified errors")
    @DisplayName("Ensure Constructor errors returns")
    @Test
    void groupAssertPlayerMessages() {
        p = new Player("343", "Joe", "Buck");
        assertAll("Testing constructor",
                () -> assertEquals(p.getFirstName(), "Andre", "First Name Failed"),
                () -> assertEquals(p.getLastName(), "Drummond", "Last Name Failed"),
                () -> assertEquals(p.getId(), "2323", "ID failed")
        );
    }

    @DisplayName("Ensure PlayerRuntimeException is caught")
    @Test
    void junit5ExceptionTest() {
        assertThrows(PlayerRuntimeException.class, () -> {
            p.anExpectedError();
        }, "ensure PlayerRuntimeException is caught");
    }

    @Disabled("Timeout example")
    @DisplayName("Assert timeout will run the full length of the process but report a timeout, " +
            "it will show the difference between the expected time and the actual runtime")
    @Test
    void assertTimeOut() {
        assertTimeout(Duration.ofMillis(1000), ()-> {
            p.longRunningMethod();
        });
    }

    @Disabled("Pre Emptive Timeout example")
    @DisplayName("Assert Pre-emptive timeout will cancel the test if the process runs past the indicated timeout")
    @Test
    void assertPreemptiveTimeOut() {
        assertTimeoutPreemptively(Duration.ofMillis(1000), ()-> {
            p.longRunningMethod();
        });
    }

    @DisplayName("Assumptions with a failed condition, note it doesnt fail the test suite")
    @Test
    void testAssumptionWithFailedCondition() {
        Assumptions.assumeTrue("Turner".equalsIgnoreCase(System.getenv("TurnerKey")));
    }

    @DisplayName("Assumptions with a success condition, note it reports itself as part of the test suite")
    @Test
    void testAssumptionWithSuccessCondition() {
        Assumptions.assumeTrue("Turner".equalsIgnoreCase("Turner"));
    }

    @DisplayName("Basic AssertJ example")
    @Test
    void basicAssertJPlayerNameExample() {
        assertThat(p.getFirstName()).isEqualTo("Andre");
        assertThat(p.getFirstName()).isNotEqualTo(p.getLastName());
        assertThat(p.getFirstName()).isNotBlank();
        assertThat(p.getFirstName().length()).isBetween(2,10);
        assertThat(p.getFirstName().length()).isNotNegative();
        assertThat(p.getFirstName().length()).isNotZero();
    }

}
