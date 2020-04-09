import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSquareBound() {
        Board board = new Board();
        Square square = board.getSquare(board.getSquare(32),12);
        assertEquals(square, board.getSquare(4));
    }

    @Test
    void getSquareWrongFvTot(){
        Board board = new Board();
        Assertions.assertThrows(RuntimeException.class, ()->
                board.getSquare(board.getSquare(32),13));
    }
}