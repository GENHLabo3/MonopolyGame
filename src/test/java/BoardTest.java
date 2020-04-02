import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    void getSquareBound() {
        Board board = new Board();
        board.getSquare(30, 12);
    }

    @Test
    void getSquareWrongOldLocation(){
        Board board = new Board();
        try {
            board.getSquare(42,12);
            fail("Exception not thrown");
        }catch(Exception e){
            //OK
        }
    }

    @Test
    void getSquareWrongFvTot(){
        Board board = new Board();
        try {
            board.getSquare(20,13);
            fail("Exception not thrown");
        }catch(Exception e){
            //OK
        }
    }


}