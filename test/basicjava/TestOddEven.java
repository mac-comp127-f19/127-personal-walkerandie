package basicjava;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestOddEven {

    @Test
    public void testOdd () {
        assertEquals(true, OddEven.isOdd(3));
        assertEquals(false, OddEven.isOdd(10));
        assertEquals(true, OddEven.isOdd(-9));
        assertEquals(false, OddEven.isOdd(-6));


    }
}
