import org.junit.Before;
import org.junit.Test;


public class SpielerErzeugungTest {
    private static Spieler spieler;
    private static Spieler spieler01;
    private static Spieler spieler02;

    // Hier folgen die Implementationen für die Testfälle 1 - 6
    // Es muss in jedem Fall der Konstruktor ausgeführt werden, da unterschiedliche Parameter überprüft werden müssen

    public SpielerErzeugungTest() {
        // default
    }

    @Before
    public void setUp() {
        spieler = new Spieler("Muster", "Max", 33, true);
        spieler01 = new Spieler(" ", "Max", 33, true);
        spieler02 = new Spieler(null, "Max", 33, true);
    }

    // Testfall 1 - gut
    @Test
    public void test1() {
        try {
            spieler.getName();
            System.out.println(spieler.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Testfall 2
    @Test
    public void test2() {
        try {
            spieler.getVorname();
            System.out.println(spieler.getVorname());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Testfall 3
    @Test
    public void test3() {
        try {
            spieler.getAlter();
            System.out.println(spieler.getAlter());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Testfall 4
    @Test
    public void test4() {
        try {
            spieler.getIstLizenziert();
            System.out.println(spieler.getIstLizenziert());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Testfall 5
    @Test
    public void test5() throws SpielerNameException{
        try{
            spieler01.getName();
            System.out.println(spieler01.getName());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    // Testfall 6
    @Test
    public void test6() throws SpielerNameException{
        try{
            spieler02.getName();
            System.out.println(spieler02.getName());
        }catch (Exception e){
            System.out.println(e.getMessage());;
        }
    }
}
