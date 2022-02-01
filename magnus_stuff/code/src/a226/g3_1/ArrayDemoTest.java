package a226.g3_1;

import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class ArrayDemoTest {

    private static ArrayDemo demo;

    public static void main(String[] args) {
    }

    @Before
    public void setUp() {
        demo = new ArrayDemo();
    }

    @Test
    public void getMaxGroesse(){
        assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
    }

    @Test
    public void testEmptyArray(){
        assertEquals(0, demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmptyArray(){
        try {
            demo.addWert(4.0f);
        } catch (Exception e) {
        } finally {
            assertEquals(1, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testFullArray(){
        try {
            for (int i = 0; i < demo.MAX_STELLEN; i++)
                demo.addWert(4.0f);
        } catch (Exception e) {
        } finally {
            assertEquals(demo.MAX_STELLEN, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testAddValid(){
        try {
            demo.addWert(6f);
        }catch (Exception e){
            System.out.println("Test nicht korrekt");

        }
    }

    @Test
    public void testAddInvalid(){
        try {
            demo.addWert('z');
        }catch (Exception e){
            System.out.println("Test nicht korrekt");
        }
    }

    @Test
    public void testGetNote() throws NotenbereichException {
        int[] list = {-1,0,5};
        demo.addWert(5.0f);
        for (int i : list)
            try {
                System.out.println(demo.getNote(i));
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }

    @Test
    public void testRemoveWert(){
        try{
            demo.addWert(3.0f);
            demo.addWert(5.0f);
            demo.addWert(2.0f);
        }catch (Exception e){
        }
        int[] list = {1, 4, 3};
        for (int i : list)
            try {
                demo.removeWert(i);
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
    }
}