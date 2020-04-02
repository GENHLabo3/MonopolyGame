import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @BeforeAll
    public static void init(){
        Player player1 = new Player("Joe", new Piece(PiecesName.Penguin));
    }

    @Test
    public void testCreatePlayerWithATakenToken_ThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                new Player("Joe", new Piece(PiecesName.Penguin))
        );

    }
}