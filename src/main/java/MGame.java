import java.util.ArrayList;

public class MGame {

    private ArrayList<Player> players;
    private Board board;
    private Cup cup;

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

        cup = new Cup(2);

        board = new Board();

        players = new ArrayList<>();

        for(int i = 0; i < totalPlayer; ++i){
            // Todo getter for go square ?
            players.add(new Player("player"+i, board, cup));
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
