import java.util.ArrayList;

public class MGame {

    private ArrayList<Die> dice;
    private ArrayList<Player> players;
    private Board board;

    private final static int TOTAL_TURN = 20;

    /**
     * Init the simulation
     * @param totalPlayer total player in the simulation
     */
    public MGame(int totalPlayer) {
        if(totalPlayer < 2)
            throw new IllegalArgumentException("Too few players");

        if(totalPlayer > 8)
            throw new IllegalArgumentException("Too many players");

        dice = new ArrayList<>();
        dice.add(new Die());
        dice.add(new Die());

        board = new Board();

        players = new ArrayList<>();

        for(int i = 0; i < totalPlayer; ++i){
            players.add(new Player("player"+i, new Piece(), board, dice));
        }
    }

    /**
     * Start the simulation for TOTAL_TURN turn
     */
    public void playGame(){
        for(int i = 0; i < TOTAL_TURN; ++i){
            playRound();
        }
    }

    /**
     * Plane one round for all player in the game
     */
    private void playRound(){
        for(Player p : players){
            p.takeTurn();
        }
    }
}
