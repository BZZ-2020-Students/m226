package aufgabe5;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpielerErzeugungTest {
    private static String name;
    private static String vorname;
    private static int age;
    private static boolean istLizenziert;
    private static Spieler spieler;

    // Hier folgen die Implementationen für die Testfälle 1 - 6
    // Es muss in jedem Fall der Konstruktor ausgeführt werden, da unterschiedliche Parameter überprüft werden müssen

    @BeforeAll
    public static void setup() {
        name = "Muster";
        vorname = "Max";
        age = 33;
        istLizenziert = true;

        try {
            spieler = new Spieler(name, vorname, age, istLizenziert);
        } catch (SpielerNameException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkParameterName() {
        assertEquals("Muster", spieler.getName());
    }

    @Test
    public void checkParameterVorname() {
        assertEquals("Max", spieler.getVorname());
    }

    @Test
    public void checkParameterAge() {
        assertEquals(33, spieler.getAlter());
    }

    @Test
    public void checkParameterLizenziert() {
        assertTrue(spieler.getIstLizenziert());
    }

    @Test
    public void checkEmptyNameThrowsException() {
        assertThrows(SpielerNameException.class, () -> {
            new Spieler("", vorname, age, istLizenziert);
        });
    }

    @Test
    public void checkNullNameThrowsException() {
        assertThrows(SpielerNameException.class, () -> {
            new Spieler(null, vorname, age, istLizenziert);
        });
    }
}
