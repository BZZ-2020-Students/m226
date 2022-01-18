package I2_1;

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import I2_1.data.HobbyListe;
import I2_1.data.Person;
import I2_1.data.PersonenListe;
import I2_1.gui.HobbyVerwaltungGUI;


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
