package I1_1_phill;

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import I1_1_phill.data.HobbyListe;
import I1_1_phill.data.Person;
import I1_1_phill.data.PersonenListe;
import I1_1_phill.gui.HobbyVerwaltungGUI;


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
