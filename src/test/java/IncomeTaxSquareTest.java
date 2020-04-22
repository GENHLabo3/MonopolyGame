import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @Test
    @DisplayName("Player landed on income tax get -10% cash")
    void landedOnIncome() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", board, cup);
        Square square = new IncomeTaxSquare("test");
        square.landedOn(p);
        assertEquals((1500 - 1500/10), p.getNetWorth());
    }

    // TODO : test with 200$ instead of 10%
}