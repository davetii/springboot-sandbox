package com.greatwideweb.springsandbox.gametime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void groupAssertPlayer() {
        Player p = new Player("2323", "Andre", "Drummonds");
        assertAll("Testing constructor",
                () -> assertEquals(p.getFirstName(), "Andre", "First Name Failed"),
                () -> assertEquals(p.getLastName(), "Drummond", "Last Name Failed"),
                () -> assertEquals(p.getId(), "2323", "ID failed")
        );
    }

}