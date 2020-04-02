package test.java;

import main.java.Cup;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CupTest {

    @Test
    void cupRollsValue() {
        Cup cup = new Cup(2);
        cup.roll();
        assertTrue(2 <= cup.getTotal() && cup.getTotal() <= 12);
    }


}
