package learnJunit;


import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;


public class Tests {
    private static Main main;

    @BeforeClass
    public static void setup() {
        main = new Main();
    }

    @Test
    public void test1() {
        assertEquals(3, main.add(1, 2));
    }

    @Test
    public void arrayT() {
        assertArrayEquals(new int[]{1, 23, 4}, main.getArray());
    }

    @Test
    public void arrayTestString() {
        assertEquals(Arrays.toString(new int[]{1, 23, 4}), Arrays.toString(main.getArray()));
    }

    @Test
    public void exceptiontest() {
        assertThrows(Exceptiondurchzero.class, () -> main.durch(1, 0));
    }
}
