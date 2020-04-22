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

    @Test
    @DisplayName("Player with more than 2000$ landed on income tax pays 200$")
    void landedOnIncomeWithMoreThan2000() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", board, cup);
        p.addCash(1000);
        Square square = new IncomeTaxSquare("test");
        square.landedOn(p);
        assertEquals((2500 - 200), p.getNetWorth());
    }
}