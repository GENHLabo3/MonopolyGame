import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class BoardTest {

    private static Board board ;

    @BeforeAll
    public static void initBoard(){
        board = new Board();
    }

    @Test
    void getSquareBound() {
        Square square = board.getSquare(board.getSquare(32), 12);
        Assertions.assertEquals(square, board.getSquare(4));
    }

    @Test
    void getSquareBound2() {
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(230));
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(-1));
    }

    @Test
    void squareNamesTest() {
        Assertions.assertEquals(board.getFirstSquare().getName(),"Go");
        for (int i = 1; i < board.TOTAL_SQUARES; i++) {
            Assertions.assertEquals(board.getSquare(i).getName(), "Square " + i );
        }
    }

    @Test
    void getSquareWrongFvTot() {
        Assertions.assertThrows(RuntimeException.class, () ->
                board.getSquare(board.getSquare(32), 13));
    }

    @Test
    void getFirstSquare(){
        Assertions.assertEquals("Go", board.getFirstSquare().getName());
    }
}