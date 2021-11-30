package a226.g3_2;

import a226.g1_123.ArrayDemo;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static junit.framework.TestCase.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class RechnerTest {
    private static Rechner r = new Rechner();
    public static void main(String[] args) {
    }

    @Before
    public void setUp() {
        r = new Rechner();
    }

    @Test
    public void testDivide() {
        float[][] input = {{4, 20, 5},{0.25f, 5, 20},{-4, -20, 5},{-4, 20, -5},{0,2,0},{0,0,2},{24.25f,'a',4},{2,194,'a'}};
        for (int i = 0; i < input.length; i++) {
            try {
                assertEquals(input[i][0], r.divide(input[i][1], input[i][2]));
            } catch (DivideException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}