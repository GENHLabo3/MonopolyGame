import java.util.ArrayList;
import java.util.Arrays;

public class Piece {

    private PiecesName name;
    public static ArrayList<PiecesName> piecePool = new ArrayList<>(Arrays.asList(PiecesName.values()));

    private Square location;

    public Piece(){
        this(piecePool.get(0));
    }

    public Piece(PiecesName name) {
        if(!piecePool.contains(name)){
            throw new IllegalArgumentException("Token already taken");
        }
        this.name = name;
        piecePool.remove(name);
        location = Board.getFirstSquare();
    }

    public Square getLocation(){
        return location;
    }

    public void setLocation(Square newLocation){
        location = newLocation;
    }
}
