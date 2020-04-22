import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    @DisplayName("Exception for game with less than 2 players")
    void checkPlayerSmallerThat2() {
        assertThrows(IllegalArgumentException.class, ()->
               new MGame(1)
        );
    }

    @Test
    @DisplayName("Exception for game with more than 8 players")
    void checkPlayerBiggerThat8() {
        assertThrows(IllegalArgumentException.class, ()->
                new MGame(10)
        );
    }
}