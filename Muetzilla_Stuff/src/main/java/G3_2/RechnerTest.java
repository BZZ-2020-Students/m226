package G3_2;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RechnerTest {

    private Rechner rechner;

    @Before
    public void setUp() {
        rechner = new Rechner();
    }

    @Test
    public void divideValid15and3() {
        float result = 0;
        try {
            result = rechner.divide(15, 3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(5.0f, result);
    }

    @Test
    public void divideValidMinus15and3() {
        float result = 0;
        try {
            result = rechner.divide(-15, 3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(-5.0f, result);
    }

    @Test
    public void divideValid15andMinus3() {
        float result = 0;
        try {
            result = rechner.divide(15, -3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(-5.0f, result);
    }

    @Test
    public void divideValidMinus15andMinus3() {
        float result = 0;
        try {
            result = rechner.divide(-15, -3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(5.0f, result);
    }

    @Test
    public void divideValidaAnd5() {
        float result = 0;
        try {
            result = rechner.divide('a', 5);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(19.4f, result);
    }

    @Test
    public void divideValida100Anda() {
        float result = 0;
        try {
            result = rechner.divide(100, 'a');
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(1.0309278f, result);
    }

    @Test(expected = DivideException.class)
    public void divisoinByZero() throws DivideException {
        rechner.divide(15, 0);
    }
    
}
