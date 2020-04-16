import java.util.Random;

public class Die {

    private static int TOTAL_FACES = 6;

    private int faceValue = -1;

    public Die() {}

    public void roll() {
        Random rand = new Random();
        faceValue = rand.nextInt(TOTAL_FACES) + 1;
    }

    public int getFaceValue() {
        if(faceValue == -1)
            throw new RuntimeException("The die has not been rolled.");

        return faceValue;
    }

}
