import org.junit.Before;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class RechnerTest {
    private static Rechner rechner;
    float result = 0;

    @Before
    public void setUp(){
        rechner = new Rechner();
    }

    @Test
    public void Valid15g3(){
        try{
            // Resultat = 15 / 7
            result = rechner.divide(15,3);
        }catch (DivideException e){
            e.getMessage();
        }
        // Prüft ob Ergebnis (Result) und dem Vorhanden 5.0f
        assertEquals(5.0f, result);
    }

    @Test
    public void Vaildneg15g3(){
        try{
            result = rechner.divide(-15,3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(-5.0f, result);
    }

    @Test
    public void Valid15gneg3(){
        try{
            result = rechner.divide(15,-3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(-5.0f, result);
    }

    @Test
    public void Validneg15gneg3(){
        try{
            result = rechner.divide(-15,-3);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(5.0f, result);
    }

    @Test
    public void Validag5(){
        try{
            result = rechner.divide('a', 5.0f);
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(19.4f, result);
    }

    @Test
    public void Valid100ga(){
        try {
            result = rechner.divide(100,'a');
        } catch (DivideException e) {
            e.printStackTrace();
        }
        assertEquals(1.0309278f, result);
    }

}
