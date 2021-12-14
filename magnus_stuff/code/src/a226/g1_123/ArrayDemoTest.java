package a226.g1_123;

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
    public void testGroesse(){
        assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
    }

    @Test
    public void testEmptyArray(){
        assertEquals(0, demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmptyArray(){
        try {
            demo.addWert(1.0f);
        }catch (Exception e){

        } finally {
            assertEquals(1, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testFullArray(){
        try {
            for(int i = 0; i < 7; i++){
                demo.addWert(1.0f);
            }
        }catch (Exception e){
            assertEquals(demo.MAX_STELLEN, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testAddValid(){
        try{
            demo.addWert(2.0f);
        } catch (NotenbereichException e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testAddInvalid(){
        try {
            demo.addWert(22.0f);
        }catch (NotenbereichException e){

        }
    }

    @Test
    public void testGetNote(){
        int[] input = {-1, 0, 5};
        for (int i : input) {
            try {
                demo.getNote(i);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Test
    public void testRemoveValidValue() {
        int[] input = {-1, 0, 5};
        for (int i : input) {
            try {
                demo.addWert(2.0f);
                demo.removeWert(i);
                assertEquals(2.0f, demo.getNote(i));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

}