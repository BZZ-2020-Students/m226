package I3_1_L.data;

import javax.swing.*;
import java.util.Vector;

/**
 * Die Klasse HobbyAbstractListMopdel erweitert die Klasse AbstractListModel
 * aus Java-Swing um Funktionalitäten für das Entfernen und Zufügen von
 * Hobby-Bezeichnungen.
 * <p>
 * Die Implementation der notwendigen Methoden aus AbstractListModel
 * erfolgen in der Unterklasse PersonenListe.
 *
 * @author René Probst
 */
public abstract class HobbyAbstractListModel extends AbstractListModel<String> {
    private static final long serialVersionUID = 8452924039276245406L;

    /**
     * Fügt der Liste der Hobby einen Eintrag zu.
     *
     * @param hobby eine Hobby-Bezeichnung
     */
    public abstract void addHobby(String hobby);

    /**
     * Löscht aus der Liste der Hobby den durch index markierten Eintrag.
     *
     * @param index Position in der Liste, die gelöscht wird.
     */

    public abstract void removeHobby(int index);

    /**
     * Liefert die Liste der Hobbies als Vector-Objekt
     *
     * @return Liste der Hobbies
     */
    public abstract Vector<String> getListe();

}
