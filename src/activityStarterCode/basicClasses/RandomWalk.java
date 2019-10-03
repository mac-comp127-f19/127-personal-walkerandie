package activityStarterCode.basicClasses;

import java.util.Random;

/**
 * Represents a random walk along the integer
 * number line starting at some value. At each step it either moves
 * forward or backward by one unit.
 */
public class RandomWalk {
    private Random rng;
    private int walkValue;

    /**
     * Creates a new random walk starting with some initial value.
     * TODO: Adjust this constructor to take an initial value for the walk.
     */
    public RandomWalk(int value) {
        rng = new Random();
        walkValue = value;
    }

    /**
     * TODO Complete me.
     * @return the current value for the random walk.
     */
    public int getValue() {
        return walkValue;
    }

    /**
     * Updates the value randomly by adding either +1 or -1.
     * TODO: Complete me.
     * @return Updated value.
     */
    public int advanceValue() {
        if (rng.nextBoolean()) {
            walkValue ++;
        } else {
            walkValue --;
        }
        return walkValue;
    }
}

