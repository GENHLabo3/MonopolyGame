package test.java;

import main.java.Cup;
import main.java.Die;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class DieTest {

    @RepeatedTest(20)
    void dieRollRangeTests() {
        Die die = new Die();
        die.roll();
        assertTrue(1 <= die.getFaceValue() && die.getFaceValue() <= 6);
    }

    @Test
    void testFaceValueNotRolled() {
        try{
            Die die = new Die();
            die.getFaceValue();
            fail("Exception not thrown");
        }catch(Exception e){
            // OK an exception has been thrown
        }
    }

}
