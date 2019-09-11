package activityStarterCode;

import activityStarterCode.stringPractice.MakeEmphatic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeEmphaticTest {

    @Test
    public void longStringTest() {
        assertEquals("EMPHASIS!!!", activityStarterCode.MakeEmphatic.makeEmphatic("emphasis"));
    }


    @Test
    public void shortStringTest() {
        assertEquals("I!!!", activityStarterCode.MakeEmphatic.makeEmphatic("i"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("!!!", activityStarterCode.MakeEmphatic.makeEmphatic(""));
    }
}
