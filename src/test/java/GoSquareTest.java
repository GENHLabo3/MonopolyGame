import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoSquareTest {
    private static Board board ;
    private static Player p;
    private static Cup cup;

    @BeforeAll
    public static void init(){
        board = new Board();
        cup = new Cup(2);
        p = new Player("Joe", new Piece(PiecesName.Penguin),board, cup);
    }

    @Test
    void landedOn() {
       Square square = new GoSquare("test");
       square.landedOn(p);
       assertEquals(1700, p.getNetWorth());
    }
}