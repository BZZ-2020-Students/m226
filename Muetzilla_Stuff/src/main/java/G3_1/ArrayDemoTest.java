package G3_1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ArrayDemoTest {

    private static ArrayDemo demo;

    public static void main(String[] args) {
    }

    @Test
    public void TestGroesse() {
        assertEquals(demo.getMaxGroesse(), demo.MAX_STELLEN);
    }

    @Test
    public void testEmptyArray() {
        assertEquals(demo.getAnzahlElemente(), 0);
    }

    @Test
    public void testNotEmptyArray() {
        try {
            demo.addWert(3.5f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
        assertEquals(demo.getAnzahlElemente(), 1);
    }

    @Test
    public void testFullArray() {
        try {
            demo.addWert(3.5f);
            demo.addWert(4f);
            demo.addWert(5.5f);
            demo.addWert(2.8f);
            demo.addWert(4.9f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
        assertEquals(demo.getAnzahlElemente(), 5);
    }

    @Test
    public void testAddValid() {
        try {
            demo.addWert(4.5f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
    }

    @Test(expected = NotenbereichException.class)
    public void testAddInvalid() throws NotenbereichException {
        demo.addWert(7.0f);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testNegativIndex() throws ArrayIndexOutOfBoundsException {
        demo.getNote(-1);
    }


    @Test
    public void testCorrectIndex() {
        try {
            demo.addWert(5.0f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
        assertEquals(5.0f, demo.getNote(0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testToHighIndex() throws ArrayIndexOutOfBoundsException {
        demo.getNote(5);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveNegativ() throws ArrayIndexOutOfBoundsException {
        demo.removeWert(-1);
    }

    @Test
    public void testRemoveValid() {
        try {
            demo.addWert(5.0f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
        demo.removeWert(0);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveToHighIndex() throws ArrayIndexOutOfBoundsException {
        demo.removeWert(6);
    }


    @Before
    public void setUp() {
        demo = new ArrayDemo();
    }
}