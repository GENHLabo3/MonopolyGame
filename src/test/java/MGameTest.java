import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MGameTest {

    @Test
    @DisplayName("Exception for game with less than 2 players")
    void checkPlayerSmallerThat2() {
        assertThrows(IllegalArgumentException.class, () ->
                new MGame(1)
        );
    }

    @Test
    @DisplayName("Exception for game with more than 8 players")
    void checkPlayerBiggerThat8() {
        assertThrows(IllegalArgumentException.class, () ->
                new MGame(10)
        );
    }

    @Test
    @DisplayName("Player position is on GoSquare and had a 200 income")
    void landedOnGoSquare() {
        Board board = new Board();
        Cup cup = new Cup(2);
        Player player = new Player("Player", board, cup);

        int playerOldCash = player.getNetWorth();

        board.getFirstSquare().landedOn(player);

        assertAll(
                () -> assertSame(player.getLocation(), board.getFirstSquare()),
                () -> assertEquals(playerOldCash + GoSquare.CASH_TO_ADD, player.getNetWorth())
        );
    }
}