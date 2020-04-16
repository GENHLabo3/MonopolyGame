import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class CupTest {

    @RepeatedTest(20)
    void cupRollsValue() {
        Random rand = new Random();
        int totalDice = rand.nextInt(20);
        Cup cup = new Cup(totalDice);
        cup.roll();
        assertTrue(totalDice <= cup.getTotal()
                && cup.getTotal() <= totalDice *  6);
    }

    @Test
    void negativeNumberOfDice() {
        assertThrows(RuntimeException.class, ()->
                new Cup(-1)
        );
    }

    @Test
    void rollWithNoDice() {
        Cup emptyCup = new Cup(0);
        emptyCup.roll();
        assertEquals(0, emptyCup.getTotal());
    }
}
