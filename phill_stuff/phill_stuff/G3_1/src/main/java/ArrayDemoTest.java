import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Beschreibung
 *
 * @author
 * @version 1.0 vom 30.11.2014
 */
public class ArrayDemoTest {

    // Anfang Attribute
    // Ende Attribute

    // Anfang Methoden
    private static ArrayDemo demo;

    @Before
    public void setUp() {
        demo = new ArrayDemo();
        try {
            demo.addWert(4.5f);
            demo.addWert(5.0f);
            demo.addWert(3.5f);
            demo.addWert(4.5f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testGroesse() {
        Assert.assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
    }

    @Test
    public void testEmptyArray() {
        Assert.assertEquals(0, demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmptyArray() {
        Assert.assertEquals(1, demo.getAnzahlElemente());
    }

    @Test
    public void testFullArray() {
        Assert.assertEquals(5, demo.getAnzahlElemente());
    }

    @Test
    public void testAddValid() {
        try {
            demo.addWert(4.5f);
        } catch (NotenbereichException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testAddInvalid() {
        Assert.assertThrows(NotenbereichException.class, () -> {
            demo.addWert(7.0f);
        });
    }


    @Test
    public void getNoteOutofBoundsminus() {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            demo.getNote(-1);
        });

    }

    @Test
    public void getNotemitFloat() {
        Assert.assertEquals(5.0f, demo.getNote(0), 0.0001);

    }

    @Test
    public void getNoteOutofboundsplus() {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            demo.getNote(5);
        });

    }

    @Test
    public void removeWertOutofBoundsminus() {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            demo.removeWert(-1);
        });

    }

    @Test
    public void removeWertvalid() {
        demo.removeWert(0);
    }

    @Test
    public void removeWertOutofboundsplus() {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            demo.removeWert(6);
        });
    }

}

