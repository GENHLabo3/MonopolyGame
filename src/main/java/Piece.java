import java.util.ArrayList;
import java.util.Arrays;

public class Piece {

    private PiecesName name;
    public static ArrayList<PiecesName> piecePool = new ArrayList<>(Arrays.asList(PiecesName.values()));

    private Square location;

    public Piece(PiecesName name) {
        if(!piecePool.contains(name)){
            throw new IllegalArgumentException("Token already taken");
        }
        this.name = name;
        piecePool.remove(name);
    }

    public Square getLocation(){
        return location;
    }

    public void setLocation(Square newLocation){
        location = newLocation;
    }
}
