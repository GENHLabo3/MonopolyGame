import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private static Board board ;
    private static Player player1;
    private static Cup cup;

    @BeforeAll
    public static void init(){
        board = new Board();
        cup = new Cup(2);
        player1 = new Player("Joe", new Piece(PiecesName.Penguin),board, cup);
    }

    @Test
    public void testCreatePlayerWithATakenToken_ThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                new Player("Joe", new Piece(PiecesName.Penguin), board, cup)
        );
    }

    @Test
    public void testSetLocation(){
        player1.setLocation(new GoSquare());
        Assertions.assertEquals("Go", player1.getPiece().getLocation().getName());
    }

    @Test
    public void add100Cash(){
        int cash = player1.getNetWorth();
        player1.addCash(100);
        Assertions.assertEquals(cash + 100, player1.getNetWorth());
    }

    @Test
    public void reduce100Cash(){
        int cash = player1.getNetWorth();
        player1.reduceCash(100);
        Assertions.assertEquals(cash - 100, player1.getNetWorth());
    }
}