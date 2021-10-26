package learningUnitF.F2_2;

/*
 * Beschreibt ein Becken für die Tiere des Zoos.
 * Das becken verfügt über einen Inventarwert sowie über
 * einen Typ und eine Bezeichnung.
 *
 */
public class Becken extends Gebaeude {

    /**
     * Erzeugt ein Becken-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
     *
     * @param bez  Bezeichnung des Gebäudes
     * @param wert Inventarwert des Gebäudes
     */
    public Becken(String bez, float wert) {
        super("Becken", bez, wert);
    }
}
