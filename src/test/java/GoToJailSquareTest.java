import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    private static Board board;
    private static Player p;
    private static Cup cup;

    @BeforeAll
    public static void init() {
        board = new Board();
        cup = new Cup(2);
        p = new Player("Joe", new Piece(PiecesName.Penguin), board, cup);
    }

    @Test
    void landedOn() {
        Square jail = new RegularSquare("jail");
        Square square = new GoToJailSquare("test", jail);
        square.landedOn(p);
        assertEquals(jail, p.getPiece().getLocation());
    }

}