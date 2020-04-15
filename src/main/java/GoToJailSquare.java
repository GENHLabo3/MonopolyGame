public class GoToJailSquare extends Square {
    /**
     * Square constructor
     *
     * @param name String : name of the square
     */
    public GoToJailSquare(String name) {
        super(name);
    }

    @Override
    public void landedOn(Player p) {
        //p.setLocation(jail);
    }
}
