import org.junit.Test;

public class RechnerTest {

    private static Rechner rechner;

    @Test
    public void testdivisonValid() {
        try {
            rechner.divide(15.0f, 3.0f);
        } catch (DivideException e) {
            e.printStackTrace();
        }
    }


}
