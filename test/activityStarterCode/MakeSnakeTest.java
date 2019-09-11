package activityStarterCode;

import activityStarterCode.stringPractice.MakeSnake;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeSnakeTest {

    @Test
    public void mixedSsTest() {
        assertEquals("SSSnake sssoundsss", activityStarterCode.MakeSnake.makeSnake("Snake sounds"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("", activityStarterCode.MakeSnake.makeSnake(""));
    }
}
