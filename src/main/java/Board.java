import java.util.ArrayList;


public class Board {

    private ArrayList<Square> squares = new ArrayList<>();

    public Board() {
        squares.add(new Square("Go"));
        for (int i = 1; i < 40; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public Square getSquares(int oldLoc, int fvTot) {
        return squares.get((oldLoc + fvTot) % 40);
    }
}
