import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardTest {

    @Test
    void getSquareBound() {
        Board board = new Board();
        Square square = board.getSquare(board.getSquare(32), 12);
        Assertions.assertEquals(square, board.getSquare(4));
    }

    @Test
    void getSquareBound2() {
        Board board = new Board();
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(230));
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(-1));
    }

    @Test
    void squareNamesTest() {
        Board board = new Board();
        Assertions.assertEquals(board.getFirstSquare().getName(),"Go");
        for (int i = 1; i < 40; i++) {
            Assertions.assertEquals(board.getSquare(i).getName(), "Square " + i );
        }
    }

    @Test
    void getSquareWrongFvTot() {
        Board board = new Board();
        Assertions.assertThrows(RuntimeException.class, () ->
                board.getSquare(board.getSquare(32), 13));
    }
}