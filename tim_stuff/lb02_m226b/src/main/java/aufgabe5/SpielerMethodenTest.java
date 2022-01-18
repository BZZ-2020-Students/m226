package aufgabe5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpielerMethodenTest {
    // Deklaration einer Referenzvariable für die Nutzung in den einzelnen Testfällen
    private String name;
    private String vorname;
    private int age;
    private boolean istLizenziert;
    private Spieler spieler;

    @BeforeEach
    //gültiges Objekt für die Test erzeugen
    public void add() {
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

    // Hier folgen die Implementationen für die Testfälle 7 - 11
    @Test
    public void checkChangeName() {
        try {
            spieler.setName("Peter");
        } catch (SpielerNameException e) {
            e.printStackTrace();
        }
        assertEquals("Peter", spieler.getName());
    }

    @Test
    public void checkSetNameEmptyThrowsException() {
        assertThrows(SpielerNameException.class, () -> {
            spieler.setName("");
        });
    }

    @Test
    public void checkSetNameNullThrowsException() {
        assertThrows(SpielerNameException.class, () -> {
            spieler.setName(null);
        });
    }

    @Test
    public void checkIfCaptain() {
        spieler.setIstCaptain(true);
        assertTrue(spieler.getIstCaptain());
    }

    @Test
    public void checkIfFullName() {
        assertEquals("Muster Max", spieler.getName() + " " + spieler.getVorname());
    }
}
