import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {
    /**
     * Square constructor
     *
     * @param name String : name of the square
     */
    public IncomeTaxSquare(String name) {
        super(name);
    }

    /**
     * Applies income tax to the player
     *
     * @param p Player : player
     */
    @Override
    public void landedOn(Player p) {
        int w = p.getNetWorth();
        p.reduceCash(min(200,w/10));

    }
}
