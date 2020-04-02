import java.util.ArrayList;


public class Board {

    private static int TOTAL_SQUARES = 40;

    private ArrayList<Square> squares = new ArrayList<>();

    public Board() {
        squares.add(new Square("Go"));
        for (int i = 1; i < TOTAL_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public Square getSquare(int oldLoc, int fvTot) {
        if(oldLoc < 0 || oldLoc >= TOTAL_SQUARES){
            throw new RuntimeException("Old location error");
        }
        if(fvTot < 2 || fvTot > 12){
            throw new RuntimeException("fvTot error");
        }
        return squares.get((oldLoc + fvTot) % TOTAL_SQUARES);
    }
}
