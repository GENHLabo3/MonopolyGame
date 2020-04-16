import java.util.Random;

public class Die {

    private static int TOTAL_FACES = 6;

    private int faceValue = -1;

    public Die() {}

    /**
     * Rolls the die
     */
    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(TOTAL_FACES) + 1;
    }

    /**
     * Get the value of the rolled die
     * @return the face value of the rolled die
     */
    public int getFaceValue() {
        if(faceValue == -1)
            throw new RuntimeException("The die has not been rolled.");

        return faceValue;
    }

}
