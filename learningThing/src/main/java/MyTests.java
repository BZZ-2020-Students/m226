import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MyTests {
    private static Calculator calc;

    @BeforeAll
    public static void setup() {
        calc = new Calculator();
    }

    @Test
    public void additionTest() {
        assertEquals(5, calc.addition(2,3));
    }

    @Test
    public void additionMinusTest() {
        assertEquals(0, calc.addition(-1, -5));
    }

    @Test
    public void arrayComparisonTest() {
        assertArrayEquals(new int[]{1,23,4}, calc.getArray());
    }

    @Test
    public void arrayComparisonStringTest() {
        assertEquals(Arrays.toString(new int[]{1, 23, 4}), Arrays.toString(calc.getArray()));
    }

    @Test
    public void assertTrueFalseExample() {
        assertFalse(false);
    }

    @Test
    public void divideTest() {
        try {
            assertEquals(2, calc.divide(8,4));
        } catch (DevideException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void divideZeroTest() {
        assertThrows(DevideException.class, () -> {
            calc.divide(5, 0);
        });
    }
}
