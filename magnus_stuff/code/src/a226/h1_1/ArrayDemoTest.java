package a226.h1_1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class ArrayDemoTest {

    private static ArrayDemo demo;

    @Before
    public void setUp() {
        demo = new ArrayDemo();
    }

    @Test
    public void testGroesse() {
        assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmptyArray() {
        try {
            demo.addWert(4.0f);
        } catch (Exception e) {
        } finally {
            assertEquals(1, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testFullArray() {
        try {
            for (int i = 0; i < demo.MAX_STELLEN; )
                demo.addWert(4.0f);
        } catch (Exception e) {
        } finally {
            assertEquals(demo.MAX_STELLEN, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testAddValid() {
        try {
            demo.addWert(3);
        } catch (NotenbereichException ex) {
            System.out.println("Test nicht korrekt");
            fail();
        }
    }

    @Test
    public void testArrayRangeValid() {
        try {
            demo.addWert(4.0f);
            assertEquals(4.0f, demo.getNote(0), 0.001f);
        } catch (Exception e) {
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayRange2High() {
        demo.getNote(demo.MAX_STELLEN);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayRange2Low() {
        demo.getNote(-1);
    }

    @Test
    public void testRemoveValidValue() {
        try {
            demo.addWert(2.0f);
            demo.addWert(3.0f);
            demo.addWert(4.0f);
            demo.removeWert(1);
            assertEquals(4.0f, demo.getNote(1), 0.001f);
        } catch (Exception e) {
            // wird nicht behandelt
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveValue2Low() {
        demo.removeWert(-1);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testRemoveValue2High() {
        demo.removeWert(demo.MAX_STELLEN);
    }
}
