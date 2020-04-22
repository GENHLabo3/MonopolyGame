import org.junit.jupiter.api.DisplayName;
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

    @Test
    @DisplayName("Player names are all correct")
    void testAllPlayerNames() {
        String[] expectedNames = {"player1", "player2", "player3", "player4"};
        MGame game = new MGame(4);
        String[] playerNames = new String[4];
        for(int i = 0; i < game.getPlayers().size(); ++i)
            playerNames[i] = game.getPlayers().get(i).getName();

        assertArrayEquals(expectedNames, playerNames);
    }
}