package main.java;

import java.util.Random;

public class Die {

    private static int TOTAL_FACES = 6;

    int faceValue;

    public Die() {}

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(TOTAL_FACES) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
