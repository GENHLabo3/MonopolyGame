import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncomeTaxSquareTest {

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
        Square square = new IncomeTaxSquare("test");
        square.landedOn(p);
        assertEquals((1500 - 1500/10), p.getNetWorth());
    }
}