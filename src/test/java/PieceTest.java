import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class PieceTest {

    @BeforeAll
    public static void init(){
        Piece p = new Piece(PiecesName.Cat);
    }

    @Test
    public void createAPieceAlreadyTakenThrownException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                new Piece(PiecesName.Cat)
                );
    }


}