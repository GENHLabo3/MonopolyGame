import java.util.ArrayList;

/**
 * Class that represents a monopoly board
 */
public class Board {

    private static int TOTAL_SQUARES = 40;

    private static Square jail;

    private static ArrayList<Square> squares = new ArrayList<>(); //ordered

    /**
     * Board constructor
     */
    public Board() {
        squares.add(new GoSquare("Go"));
        for (int i = 1; i < TOTAL_SQUARES; i++) {
            if(i == 10 || i == 30){
                squares.add(new IncomeTaxSquare("Square " + i));
            } else if(i == 20){
                squares.add(new GoToJailSquare("Square " + i));
            } else {
                squares.add(new RegularSquare("Square " + i));
            }
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

    /**
     * Get the first square
     * @return the 1st square
     */
    public static Square getFirstSquare(){
        return squares.get(0);
    }
}
