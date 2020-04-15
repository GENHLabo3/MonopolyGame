import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private static ArrayList<Die> dice = new ArrayList<>();
    private static Board board = new Board();
    private static Player player1;


    @BeforeAll
    public static void init(){
        dice.add(new Die());
        dice.add(new Die());
        player1 = new Player("Joe", new Piece(PiecesName.Penguin),board, dice);
    }

    @Test
    public void testCreatePlayerWithATakenToken_ThrowException(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->
                new Player("Joe", new Piece(PiecesName.Penguin), board, dice)
        );
    }

    @Test
    public void testSetLocation(){
        player1.setLocation(new Square("Go"));
        Assertions.assertEquals("Go", player1.getPiece().getLocation().getName());
    }

    @Test
    public void add100Cash(){
        player1.addCash(100);
        Assertions.assertEquals(1600, player1.getNetWorth());
    }

    @Test
    public void reduce100Cash(){
        player1.reduceCash(100);
        Assertions.assertEquals(1400, player1.getNetWorth());
    }
}