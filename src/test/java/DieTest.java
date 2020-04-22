import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {

    @RepeatedTest(20)
    @DisplayName("Value of a single roll between 1 and 6")
    void dieRollRangeTests() {
        Die die = new Die();
        die.roll();
        assertTrue(1 <= die.getFaceValue() && die.getFaceValue() <= 6);
    }

    @Test
    @DisplayName("Exception for the value of an unrolled die")
    void testFaceValueNotRolled() {
        Assertions.assertThrows(RuntimeException.class, ()->
                new Die().getFaceValue()
        );
    }

}
