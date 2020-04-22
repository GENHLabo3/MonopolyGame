public class GoSquare extends Square {

    public final static int CASH_TO_ADD = 200;
  
    /**
     * Square constructor
     */
    public GoSquare() {
        super("Go");

    }

    /**
     * Adds a fixed amount of money to the player
     *
     * @param p Player : player
     */
    @Override
    public void landedOn(Player p) {
        p.addCash(CASH_TO_ADD);
    }
}
