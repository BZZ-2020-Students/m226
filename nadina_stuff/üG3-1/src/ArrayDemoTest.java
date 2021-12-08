import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

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
       assertEquals(demo.MAX_STELLEN,demo.getMaxGroesse());
    }

    @Test
    public void testEmpthyArray(){
        assertEquals(0,demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmpthyArray(){
        try {
            demo.addWert(6f);
        } catch (Exception e){
            e.getMessage();
        } finally {
            assertEquals(1,demo.getAnzahlElemente());
        }
    }

    @Test
    public void testFullArray(){
        try {
            for (int i = 0;  i < demo.MAX_STELLEN; i++)
                demo.addWert(4.5f);
            }catch (Exception e){
                e.getMessage();
            } finally {
            assertEquals(demo.MAX_STELLEN, demo.getAnzahlElemente());
        }
    }

    @Test
    public void testAddValid(){
        try {
            demo.addWert(5f);
        } catch (NotenbereichException e){
            System.out.println("Kein Korrekter Test!");
        }

    }

    @Test
    public void testAddInvalid(){
        try {
            demo.addWert(13f);
        } catch (NotenbereichException e){
            System.out.println("Kein Korrekter Test");
        }
    }

    @Test
    public void testfall1(){
        try {
            demo.getNote(-1);
        } catch (Exception e){
            e.getMessage();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testfall2(){
        try {
            demo.addWert(5.0f);
            demo.getNote(0);
        } catch(NotenbereichException e){
            e.getMessage();
        }
    }

    @Test
    public void testfall3(){
        try {
            demo.getNote(5);
        } catch (Exception e){
            e.getMessage();
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void removeWert1(){
        try {
            demo.addWert(1f);
            demo.removeWert(-1);
            assertEquals(1f, demo.getNote(-1));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void removeWert2(){
        try {
            demo.addWert(5.0f);
            demo.removeWert(0);
            assertEquals(5.0f, demo.getNote(0));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void removeWert3(){
        try {
            demo.addWert(4f);
            demo.removeWert(5);
            assertEquals(4f, demo.getNote(5));
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}