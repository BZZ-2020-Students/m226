package I3_1;
import I3_1.data.HobbyListe;
import I3_1.data.Person;
import I3_1.data.PersonenListe;
import I3_1.gui.HobbyVerwaltungGUI;

/**
 * Die Hauptklasse der Anwendung instanziert die Model- und GUI-Klassen.
 * ACHTUNG:
 * Die Liste der Personen wird mit Objekten best�ckt bevor die GUI-Klasse
 * und deren graphischen Komponenten erzeugt sind.
 * Daher darf hier die Methode addPerson aus der Klasse PersonenListe
 * NICHT verwendet werden.
 * 
 * Der GUI-Klasse werden die Referenzen der Model-Klassen �bergeben, damit
 * das GUI - �ber die entsprechenden Konfort-Kalsse der Schnittstellen - die
 * Referenzen zuweisen kann.
 * 
 * @author	Ren� Probst
 * @version	1.0
 * @date	30.12.2014
 *
 */
public class HobbyVerwaltung {
	public static void main(String[] args){
		HobbyListe hl = new HobbyListe();
		PersonenListe pl = new PersonenListe();
		pl.setList(new Person("Muster", "Max", hl.getElementAt(5)));
		pl.setList(new Person("Meier", "Martha", hl.getElementAt(0)));
		pl.setList(new Person("Amacher", "Konrad", hl.getElementAt(3)));
		new HobbyVerwaltungGUI(hl, pl);
	}
}
