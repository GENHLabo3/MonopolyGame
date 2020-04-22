import java.util.ArrayList;

public class MGame {

    private final static int TOTAL_TURN  = 20;
    private final static int TOTAL_DICE  = 2;
    private final static int MIN_PLAYERS = 2;
    private final static int MAX_PLAYERS = 8;

    private final static String PLAYER_PREFIX = "player";

    private ArrayList<Player> players;
    private Board board;
    private Cup cup;

    /**
     * Init the simulation
     * @param totalPlayer total player in the simulation
     */
    public MGame(int totalPlayer) {
        if(totalPlayer < MIN_PLAYERS)
            throw new IllegalArgumentException("Too few players");

        if(totalPlayer > MAX_PLAYERS)
            throw new IllegalArgumentException("Too many players");

        cup     = new Cup(TOTAL_DICE);
        board   = new Board();
        players = new ArrayList<>();

        for(int i = 0; i < totalPlayer; ++i){
            // Todo getter for go square ?
            players.add(new Player(PLAYER_PREFIX + i, board, cup));
        }
    }

    /**
     * Start the simulation for TOTAL_TURN turn
     */
    public void playGame(){
        for(int i = 0; i < TOTAL_TURN; ++i){
            System.out.println("------------- ROUND " + (i + 1) + "-------------");
            playRound();
        }
    }

    /**
     * Plane one round for all player in the game
     */
    private void playRound(){
        for(Player p : players){
            p.takeTurn();
            displayPlayerState(p);
        }
    }

    /**
     * Displays the state of a player :
     *     ex : player1 has 1500$ on  Square 4
     * @param player
     */
    private void displayPlayerState(Player player) {
        System.out.println(player.getName() + " has " + player.getNetWorth() +
                "$ on " + player.getLocation().getName());
    }
}
