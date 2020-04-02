import java.util.ArrayList;
import java.util.Arrays;

public class Piece {

    PiecesName name;
    static ArrayList<PiecesName> piecePool = new ArrayList<>(Arrays.asList(PiecesName.values()));

    public Piece(PiecesName name) {
        if(!piecePool.contains(name)){
            throw new IllegalArgumentException("Token already taken");
        }
        this.name = name;
        piecePool.remove(name);
    }
}
