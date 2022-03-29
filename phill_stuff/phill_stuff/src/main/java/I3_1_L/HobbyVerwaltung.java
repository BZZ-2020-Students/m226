package I3_1_L;

import I3_1_L.data.HobbyListe;
import I3_1_L.data.PersonenListe;
import I3_1_L.db.HobbyDataBase;
import I3_1_L.db.PersonDataBase;
import I3_1_L.gui.HobbyVerwaltungGUI;

/**
 * Die Hauptklasse der Anwendung instanziert die Model- und GUI-Klassen.
 * ACHTUNG:
 * Die Liste der Personen wird mit Objekten bestückt bevor die GUI-Klasse
 * und deren graphischen Komponenten erzeugt sind.
 * Daher darf hier die Methode addPerson aus der Klasse PersonenListe
 * NICHT verwendet werden.
 * <p>
 * Der GUI-Klasse werden die Referenzen der Model-Klassen übergeben, damit
 * das GUI - über die entsprechenden Konfort-Kalsse der Schnittstellen - die
 * Referenzen zuweisen kann.
 *
 * @author René Probst
 */
public class HobbyVerwaltung {
    public static void main(String[] args) {
        HobbyDataBase hdb = new HobbyDataBase();
        PersonDataBase pdb = new PersonDataBase();
        HobbyListe hl = new HobbyListe(hdb);
        PersonenListe pl = new PersonenListe(pdb);
        hl.addHobby("Test");
        //pl.setList(new Person("Muster", "Max", hl.getElementAt(5)));
        //pl.setList(new Person("Meier", "Martha", hl.getElementAt(0)));
        //pl.setList(new Person("Amacher", "Konrad", hl.getElementAt(3)));
        new HobbyVerwaltungGUI(hl, pl);
    }
}
