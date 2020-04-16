public class GoSquare extends Square {

    private static int cashToAdd = 200;

    /**
     * Square constructor
     */
    public GoSquare() {
        super("Go");

    }

    /**
     * Adds 200 to the player
     *
     * @param p Player : player
     */
    @Override
    public void landedOn(Player p) {
        p.addCash(cashToAdd);
    }
}
