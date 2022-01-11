package I1_1.hobbyverwaltung;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import I1_1.hobbyverwaltung.data.HobbyListe;
import I1_1.hobbyverwaltung.data.Person;
import I1_1.hobbyverwaltung.data.PersonenListe;
import I1_1.hobbyverwaltung.gui.HobbyVerwaltungGUI;

/**
 * Die Hauptklasse der Anwendung instanziert die Model- und GUI-Klassen.
 * ACHTUNG:
 * Die Liste der Personen wird mit Objekten best�ckt bevor die GUI-Klasse
 * und deren graphischen Komponenten erzeugt sind.
 * Daher darf hier die Methode addPerson aus der Klasse I1_1.hobbyverwaltung.data.PersonenListe
 * NICHT verwendet werden.
 * <p>
 * Der GUI-Klasse werden die Referenzen der Model-Klassen �bergeben, damit
 * das GUI - �ber die entsprechenden Konfort-Kalsse der Schnittstellen - die
 * Referenzen zuweisen kann.
 *
 * @author Ren� Probst
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
