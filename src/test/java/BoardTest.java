import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BoardTest {

    private static Board board ;

    @BeforeAll
    public static void initBoard(){
        board = new Board();
    }

    @Test
    @DisplayName("Get the right square after a dice throw")
    void getSquareBound() {
        Square square = board.getSquare(board.getSquare(32), 12);
        Assertions.assertEquals(square, board.getSquare(4));
    }

    @Test
    @DisplayName("Exception check for out of bounds squares")
    void getSquareBound2() {
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(230));
        Assertions.assertThrows(RuntimeException.class, () -> board.getSquare(-1));
    }

    @Test
    @DisplayName("Square names")
    void squareNamesTest() {
        Assertions.assertEquals(board.getFirstSquare().getName(),"Go");
        for (int i = 1; i < board.TOTAL_SQUARES; i++) {
            Assertions.assertEquals(board.getSquare(i).getName(), "Square " + i );
        }
    }

    @Test
    @DisplayName("Get a square from a corrupted dice throw")
    void getSquareWrongFvTot() {
        Assertions.assertThrows(RuntimeException.class, () ->
                board.getSquare(board.getSquare(32), 13));
    }

    @Test
    void getFirstSquare(){
        Assertions.assertEquals("Go", board.getFirstSquare().getName());
    }
}