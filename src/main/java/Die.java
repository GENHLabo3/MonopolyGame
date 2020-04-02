package main.java;

import java.util.Random;

public class Die {

    private static int TOTAL_DEFAULT_FACES = 6;

    int totalFaces;
    int faceValue;

    public Die(int totalFaces) {
        this.totalFaces = totalFaces;
    }

    public Die() {
        this(TOTAL_DEFAULT_FACES);
    }

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(totalFaces) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }

}
