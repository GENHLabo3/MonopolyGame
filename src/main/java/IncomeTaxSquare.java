import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {

    public final static int MAX_TAX = 200;
    public final static int PERCENTAGE = 10;

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
        p.reduceCash(min(MAX_TAX, (w/100) * PERCENTAGE));

    }
}
