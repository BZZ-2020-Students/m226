package F2_2;

/*
 * Beschreibt einen Stall f�r die Tiere des Zoos.
 * Der Stall verf�gt �ber einen Inventarwert sowie �ber
 * einen Typ und eine Bezeichnung.
 *
 */
public class Stall extends Gebaeude {

    /**
     * Erzeugt ein Stall-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
     *
     * @param bez  Bezeichnung des Geb�udes
     * @param wert Inventarwert des Geb�udes
     */
    public Stall(String bez, float wert) {
        super("Stall", bez, wert);
    }
}
