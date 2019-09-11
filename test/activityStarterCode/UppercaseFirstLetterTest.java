package activityStarterCode;

import activityStarterCode.stringPractice.UppercaseFirstLetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UppercaseFirstLetterTest {

    @Test
    public void uppercaseStringTest() {
        assertEquals("Uppercase", activityStarterCode.UppercaseFirstLetter.uppercaseFirstLetter("Uppercase"));
    }

    @Test
    public void longStringTest() {
        assertEquals("Uppercase", activityStarterCode.UppercaseFirstLetter.uppercaseFirstLetter("uppercase"));
    }

    @Test
    public void shortStringTest() {
        assertEquals("A", activityStarterCode.UppercaseFirstLetter.uppercaseFirstLetter("a"));
    }

    @Test
    public void emptyStringTest() {
        assertEquals("", UppercaseFirstLetter.uppercaseFirstLetter(""));
    }

    @Test
    public void sameLetterTest() {
        assertEquals("Eeee", activityStarterCode.UppercaseFirstLetter.uppercaseFirstLetter("eeee"));
    }

}
