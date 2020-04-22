public class Player {

    private String name;
    private Square loc;

    private Board board;
    private Cup cup;

    private int cash;

    private final static int START_CASH = 1500;

    public Player(String name, Board board, Cup cup) {
        this.name = name;
        this.loc = board.getFirstSquare();
        this.board = board;
        this.cup = cup;
        cash = START_CASH;
    }

    public String getName() {
        return name;
    }

    public Square getLocation() {
        return loc;
    }

    /**
     * Roll dice and move the player to the corresponding location
     */
    public void takeTurn() {

        cup.roll();
        int fv = cup.getTotal();

        loc = board.getSquare(loc, fv);
        loc.landedOn(this);
    }

    public void setLocation(Square square) {
        loc = square;
    }

    public void addCash(int amount) {
        cash += amount;
    }

    public int getNetWorth() {
        return cash;
    }

    public void reduceCash(int amount) {
        cash -= amount;
    }
}
