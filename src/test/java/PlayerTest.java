import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {
    private static Board board ;
    private static Player player1;
    private static Cup cup;

    @BeforeAll
    public static void initBoard() {
        board = new Board();
        cup = new Cup(2);

    }

    @BeforeEach
    public void createPlayer(){
        player1 = new Player("Joe", board, cup);
    }


    @Test
    public void testSetLocation(){
        player1.setLocation(new GoSquare());
        Assertions.assertEquals("Go", player1.getLocation().getName());
    }

    @ParameterizedTest
    @ValueSource(ints = {100, 200})
    public void add100Cash(int amount){
        int cash = player1.getNetWorth();
        player1.addCash(amount);
        Assertions.assertEquals(cash + amount, player1.getNetWorth());
    }

    @Test
    public void reduce100Cash(){
        int cash = player1.getNetWorth();
        player1.reduceCash(100);
        Assertions.assertEquals(cash - 100, player1.getNetWorth());
    }

    @Test
    @DisplayName("Check that the goSquare is initialized before the player")
    public void goSquareCantBeNullWhenAPlayerIsCreate(){
        Assertions.assertNotNull(player1.getLocation(), "The GoSquare is null");
    }
}