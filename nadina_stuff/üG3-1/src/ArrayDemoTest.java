import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class ArrayDemoTest {
    private static ArrayDemo demo;

    // Methode setUp klar vordefiniert -> Folie 13 in Unit G Folie
    @Before
    public void setUp() {
        demo = new ArrayDemo();
    }

    // assesrtEquals auf Folie 14 in Unit G Folie
    @Test
    public void testGroesse(){
        // Methode(konstanten Wert, Parameter)
        assertEquals(demo.MAX_STELLEN, demo.getMaxGroesse());
    }

    /* Testen der Methode getAnzahlElemente()
    Überprüfung korreten Verhaltens ins verschiedenen Situationen*/
    @Test
    public void testEmptyArray(){
        assertEquals(0, demo.getAnzahlElemente());
    }

    @Test
    public void testNotEmptyArray(){
       try{
           demo.addWert(5f);
       }catch (Exception e){
           // nicht behandeln
       }finally {
           assertEquals(1,demo.getAnzahlElemente());
       }
    }

    @Test
    public void testFullArray(){
        try {
            // nicht grösser als Array länge
            for (int i = 0; i < demo.MAX_STELLEN; i++) {
                demo.addWert(4.6f);
            }
        }catch (Exception e){
            // nicht behandeln
        }finally {
            assertEquals(demo.MAX_STELLEN, demo.getAnzahlElemente());
        }
    }

    /* Testen der Methode addWert()
     Überprüfung einer Methode, welche im Fehlerfall eine Exception wird*/

    @Test
    public void testAddValid(){
        try{
            demo.addWert(4f);
            // fail(); // lässt den Test durchfallen - fail wenn das erreicht wird
        }catch(NotenbereichException e){
            System.out.println("Kein korrekter Test!");
        }
    }

    // Wird die Exception in der Annotation angegeben und im Code nicht behandelt
    @Test(expected = NotenbereichException.class)
    public void testAddInvalid() throws  NotenbereichException{
        demo.addWert(3);
    }

    // Testfälle

    /* Erwartetes Ergebniss : ArrayIndexOutOfBoundsException wird geworfen
    * geworfen mit throws also wird fie Exception in der Annotation angegeben*/
    @Test (expected = ArrayIndexOutOfBoundsException.class)
    public void testfall1() throws ArrayIndexOutOfBoundsException {
        demo.getNote(-1);
    }

    @Test
    public void testfall2(){
        try{
            demo.addWert(5.0f);
        }catch (NotenbereichException e){
            // nicht behandeln
            // Notenbereich exception damit die Note sich im richtigen Bereich befindet
        }finally{
            assertEquals(5.0f, demo.getNote(0));
        }
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testfall3() throws ArrayIndexOutOfBoundsException{
        demo.getNote(5);
    }

    // Testen der Methode removeWert()
    /*
    * Test fall 1 | Eingabewert: -1 | Testwert: - | EE: ArrayIndexOutOfBoundsException wird geworfen
    * */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void negativeIndex() throws ArrayIndexOutOfBoundsException{
        demo.removeWert(-10);
    }

    /*
     * Test fall 2 | Eingabewert: 7 | Testwert: - | EE: ArrayIndexOutOfBoundsException wird geworfen
     * */
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void highIndex() throws ArrayIndexOutOfBoundsException{
        demo.removeWert(7);
    }

    /*
     * Test fall 3 | Eingabewert: 0 | Testwert: 5.0f | EE: --
     * */

    @Test
    public void removeValidE(){
        try{
            demo.addWert(5.0f);
        }catch (NotenbereichException e){
            e.getMessage();
        }
        demo.removeWert(0);
    }
}