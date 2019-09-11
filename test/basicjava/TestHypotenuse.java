package basicjava;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHypotenuse {

    @Test
    public void firstTest () {
        assertEquals(5,Hypotenuse.calculateHypotenuse(3, 4));
    }


}
