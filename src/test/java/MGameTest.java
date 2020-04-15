import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    void checkPlayerSmallerThat2() {
        assertThrows(IllegalArgumentException.class, ()->
               new MGame(1)
        );
    }

    @Test
    void checkPlayerBiggerThat8() {
        assertThrows(IllegalArgumentException.class, ()->
                new MGame(10)
        );
    }
}