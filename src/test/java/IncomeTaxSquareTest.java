import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

    @Test
    void landedOnIncome() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", board, cup);
        Square square = new IncomeTaxSquare("test");
        square.landedOn(p);
        assertEquals((1500 - 1500/10), p.getNetWorth());
    }
}