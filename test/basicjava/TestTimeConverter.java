package basicjava;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTimeConverter {

    @Test
    public void simpleTest () {
        assertEquals(21600,TimeConverter.inSeconds(6,0,0), 0.00001);
        assertEquals(10855,TimeConverter.inSeconds(3,0,55), 0.00001);
        assertEquals(600,TimeConverter.inSeconds(0,10,0), 0.00001);
    }
}
