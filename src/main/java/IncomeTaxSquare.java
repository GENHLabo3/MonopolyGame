import static java.lang.Integer.min;

public class IncomeTaxSquare extends Square {

    final static int maxTax = 200;
    final static int percentage = 10;

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
        p.reduceCash(min(maxTax,(w/100) * percentage));

    }
}
