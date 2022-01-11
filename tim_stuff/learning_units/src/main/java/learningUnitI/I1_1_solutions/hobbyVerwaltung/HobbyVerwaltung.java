package learningUnitI.I1_1_solutions.hobbyVerwaltung;

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import learningUnitI.I1_1_solutions.hobbyVerwaltung.data.HobbyListe;
import learningUnitI.I1_1_solutions.hobbyVerwaltung.data.Person;
import learningUnitI.I1_1_solutions.hobbyVerwaltung.data.PersonenListe;
import learningUnitI.I1_1_solutions.hobbyVerwaltung.gui.HobbyVerwaltungGUI;

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
 * @version 1.0
 * @date 30.12.2014
 */
public class HobbyVerwaltung {
    public static void main(String[] args) {
        HobbyListe hl = new HobbyListe();
        PersonenListe pl = new PersonenListe();
        pl.setList(new Person("Muster", "Max", hl.getElementAt(5)));
        pl.setList(new Person("Meier", "Martha", hl.getElementAt(0)));
        pl.setList(new Person("Amacher", "Konrad", hl.getElementAt(3)));
        new HobbyVerwaltungGUI(hl, pl);
    }
}
