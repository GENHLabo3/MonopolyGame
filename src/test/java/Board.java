import java.util.ArrayList;


public class Board {

    private static int TOTAL_SQUARES = 40;

    private ArrayList<Square> squares = new ArrayList<>(); //ordered

    public Board() {
        squares.add(new Square("Go"));
        for (int i = 1; i < TOTAL_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    public Square getSquare(Square oldLoc, int fvTot) {
        if(fvTot < 2 || fvTot > 12){
            throw new RuntimeException("fvTot error");
        }
        return squares.get((squares.indexOf(oldLoc) + fvTot) % TOTAL_SQUARES);
    }

    public Square getSquare(int pos){
        return squares.get(pos);
    }

}
