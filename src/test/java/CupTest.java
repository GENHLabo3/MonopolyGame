package test.java;

import main.java.Cup;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CupTest {

    @RepeatedTest(20)
    void cupRollsValue() {
        Cup cup = new Cup(2);
        cup.roll();
        assertTrue(2 <= cup.getTotal() && cup.getTotal() <= 12);
    }

    @Test
    void negativeNumberOfDice() {
        try{
            Cup cup = new Cup(-1);
            fail("Exception not thrown");
        }catch(Exception e){
            // OK an exception has been thrown
        }
    }

    @Test
    void rollWithNoDice() {
        Cup emptyCup = new Cup(0);
        emptyCup.roll();
        assertEquals(0, emptyCup.getTotal());
    }
}
