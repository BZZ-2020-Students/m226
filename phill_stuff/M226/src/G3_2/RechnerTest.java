package G3_2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class RechnerTest {

    private static Rechner rechner;

    public RechnerTest() {
        rechner = new Rechner();
    }

    @Test
    public void testDivByZero() {
        assertThrows(DivideException.class, () -> rechner.divide(1.0f, 0.0f));
    }

    @ParameterizedTest(name = "\"{0}\" should match \"{1}\"")
    @CsvSource({
            "8.0f, 2.0f, 4.0f",
            "-8.0f, 2.0f, -4.0f",
            "8.0f, -2.0f, -4.0f",
            "-8.0f, -2.0f, 4.0f",
            //"'a', 2.0f, 48.5f",
            //"97.0f, 'a', 1.0f",
    })
    public void testDivWithValues(float divisor, float dividend, float expected) {
        try {
            assertEquals(expected, rechner.divide(divisor, dividend), 0.0f);
        } catch (DivideException ex) {
        }
    }

    @Test
    public void testDivWithCharAsDivisorValue() {
        try {
            assertEquals(48.5f, rechner.divide('a', 2.0f), 0.0f);
        } catch (DivideException ex) {
        }
    }

    @Test
    public void testDivWithCharAsDividendValue() {
        try {
            assertEquals(1.0f, rechner.divide(97.0f, 'a'), 0.0f);
        } catch (DivideException ex) {
        }
    }
}
  