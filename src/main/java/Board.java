import java.util.ArrayList;

/**
 * Class that represents a monopoly board
 */
public class Board {

    private static int TOTAL_SQUARES = 40;

    private ArrayList<Square> squares = new ArrayList<>(); //ordered

    /**
     * Board constructor
     */
    public Board() {
        squares.add(new Square("Go"));
        for (int i = 1; i < TOTAL_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    /**
     * Method that takes a starting square and a movement value and returns the resulting square
     *
     * @param oldLoc Square : Starting square
     * @param fvTot  int : Movement value
     * @return Square :resulting square
     */
    public Square getSquare(Square oldLoc, int fvTot) {
        if (fvTot < 2 || fvTot > 12) {
            throw new RuntimeException("fvTot error");
        }
        return squares.get((squares.indexOf(oldLoc) + fvTot) % TOTAL_SQUARES);
    }

    /**
     * Method that gets a specified square
     *
     * @param pos int : position of the square to get
     * @return Square
     */
    public Square getSquare(int pos) {
        if (pos < 0 || pos >= TOTAL_SQUARES) {
            throw new RuntimeException("Position out of range");
        }
        return squares.get(pos);
    }
}
