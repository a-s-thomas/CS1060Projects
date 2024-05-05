import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private int numSides;

    private int value;

    public int getNumSides() {
        return numSides;
    }

    public int getValue() {
        return value;
    }

    public void setNumSides(int numSides) {
        this.numSides = numSides;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Die() {
        this.numSides = 6;
        value = 1;
    }

    public Die(int numSides) {
        value = 1;
        this.numSides = numSides;
    }

    @Override
    public String toString() {
        return "number of sides: " + numSides + " value: " + value;
    }

    public void roll(int numSides) {
        int roll = ThreadLocalRandom.current().nextInt(1, numSides + 1);
        setValue(roll);
    }
}
