import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    @DisplayName("Player landed on Jail")
    void landedOnJail() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", board, cup);
        Square jail = new RegularSquare("jail");
        Square square = new GoToJailSquare("test", jail);
        square.landedOn(p);
        assertEquals(jail, p.getLocation());
    }

}