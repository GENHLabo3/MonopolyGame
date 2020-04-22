public class GoToJailSquare extends Square {
    private final Square JAIL;

    /**
     *
     * Square constructor
     *
     * @param name String : name of the square
     * @param jail Square : jail square
     */
    public GoToJailSquare(String name, Square jail) {
        super(name);
        this.JAIL = jail;
    }


    /**
     * Sends the player to the jail square
     * @param p Player : player
     */
    @Override
    public void landedOn(Player p) {
        p.setLocation(JAIL);
    }
}
