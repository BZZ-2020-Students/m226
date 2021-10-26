package learningUnitF.F2_2;

/*
 * Beschreibt ein Gehege für die Tiere des Zoos.
 * Das Gehege verfügt über einen Inventarwert sowie über
 * einen Typ und eine Bezeichnung.
 *
 */
public class Gehege extends Gebaeude {

    /**
     * Erzeugt ein Gebäude-Objekt mit dem Typ und der Bezeichnung
     *
     * @param bez  Bezeichnung des Gebäudes
     * @param wert Inventarwert des Gebäudes
     */
    public Gehege(String bez, float wert) {
        super("Gehege", bez, wert);
    }
}
