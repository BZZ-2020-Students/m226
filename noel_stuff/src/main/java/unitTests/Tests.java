package unitTests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Tests {
    private static Main main;

    @BeforeAll
    public static void init() {
        main = new Main();
    }

    @Test
    public void test1() {
        int result = main.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void test2() {
        int result = main.add(2, 3);
        assertEquals(6, result);
    }

    @Test
    public void arrayTest() {
        int[] result = main.getArray();
        int[] expected = {1, 23, 4};
        assertEquals(Arrays.toString(expected), Arrays.toString(result));
    }

    @Test
    public void exceptionTest() {
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            main.throwException(true);
        });
    }
}
