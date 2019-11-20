package com.greatwideweb.springsandbox.gametime;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PlayerTestMockitoExtension {

    @Mock
    Player mockPlayer;

    @Test
    void testMockitoExtensionMock() {
        when(mockPlayer.getFirstName()).thenReturn("Dave");
        assertThat(mockPlayer.getFirstName()).isEqualTo("Dave");
    }

}
