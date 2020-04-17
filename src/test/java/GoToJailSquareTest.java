import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    void landedOnJail() {
        Board  board = new Board();
        Cup cup = new Cup(2);
        Player p = new Player("Joe", new Piece(PiecesName.Battleship), board, cup);
        Square jail = new RegularSquare("jail");
        Square square = new GoToJailSquare("test", jail);
        square.landedOn(p);
        assertEquals(jail, p.getPiece().getLocation());
    }

}