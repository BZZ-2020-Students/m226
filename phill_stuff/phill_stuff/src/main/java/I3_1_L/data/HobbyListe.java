package I3_1_L.data;

import I3_1_L.db.DAO_Hobby_Interface;

import java.util.Collections;
import java.util.Vector;

/**
 * Die Klasse stellt eine Liste von Hobby-Bezeichnungen bereit.
 * Die Liste ist "read-only", da in der aktuellen Fassung keine Objekte eingefügt oder
 * entfernt werden können.
 * Für die Anzeige der Liste in einer JList wird das Interface ListModel implementiert.
 *
 * @author René Probst
 */
public class HobbyListe extends HobbyAbstractListModel {
    private static final long serialVersionUID = 7326172834841098868L;

    private Vector<String> hobbies;
    //private String[] hobby =  {"Skifahren", "Fussballspielen", "Singen", "Nähen", "Tanzen", "Lesen", "Partyorganisator"};
    private DAO_Hobby_Interface dataBase;

    public HobbyListe(DAO_Hobby_Interface dataBase) {
        this.dataBase = dataBase;
        hobbies = dataBase.loadHobbyListe();
        if (hobbies == null)
            hobbies = new Vector<String>();
		/*
		hobby = new Vector<String>();
		hobby.add("Skifahren");
		hobby.add("Fussballspielen");
		hobby.add("Singen");
		hobby.add("Nähen");
		hobby.add("Lesen");
		hobby.add("Partyorganisator");
		*/
        sortListe();
    }

    /*
     * Implementation der Methoden der Schnittstelle ListModel.
     * Damit die Implementation einfacher ausfällt, wird von der Komfort-Klasse
     * AbstractListModel geerbt. Dadurch sind einige Implementation bereits
     * realisiert.
     */

    /**
     * Liefert die durch index markierte Hobby-Bezeichnung aus der Liste
     *
     * @param index Position in der Liste die gelesen wird
     * @return Bezcihnung des Hobbys
     */
    @Override
    public String getElementAt(int index) {
        if (index < hobbies.size())
            return hobbies.get(index);
        else
            return null;
    }

    /**
     * Liefert die Grösse der Liste
     *
     * @return Grösse der Liste
     */
    @Override
    public int getSize() {
        return hobbies.size();
    }

    /*
     * Implementation der Methoden aus HobbyAbsractListModel
     */

    /**
     * Fügt der Liste der Hobby einen Eintrag zu.
     *
     * @param hobby eine Hobby-Bezeichnung
     */
    public void addHobby(String hobby) {
        this.hobbies.add(hobby);
        sortListe();
        dataBase.storeHobbyListe(this.hobbies);
    }

    /**
     * Löscht aus der Liste der Hobby den durch index markierten Eintrag.
     *
     * @param index Position in der Liste, die gelöscht wird.
     */
    public void removeHobby(int index) {
        hobbies.remove(index);
        this.fireContentsChanged(this, 0, getSize());
        //fireIntervalChanged(this,0,getSize());
        dataBase.storeHobbyListe(this.hobbies);
    }

    /*
     * Sortiert die Liste entsprechende dem Typ (hier String)
     */
    private void sortListe() {
        Collections.sort(hobbies);
    }

    /**
     * Liefert die Liste der Hobbies als Vector-Objekt
     *
     * @return Liste der Hobbies
     */
    public Vector<String> getListe() {
        return hobbies;
    }
}
