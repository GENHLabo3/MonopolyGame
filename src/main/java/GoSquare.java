public class GoSquare extends Square {
    /**
     * Square constructor
     *
     * @param name String : name of the square
     */
    public GoSquare(String name) {
        super(name);
    }

    /**
     * Adds 200 to the player
     *
     * @param p Player : player
     */
    @Override
    public void landedOn(Player p) {
        p.addCash(200);
    }
}
