import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private static ArrayList<Die> dice = new ArrayList<>();
    private static Board board = new Board();

    @BeforeAll
    public static void init(){
        dice.add(new Die());
        dice.add(new Die());
        Player player1 = new Player("Joe", new Piece(PiecesName.Penguin),board, dice);
    }

    @Test
    public void testCreatePlayerWithATakenToken_ThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                new Player("Joe", new Piece(PiecesName.Penguin), board, dice)
        );
    }
}