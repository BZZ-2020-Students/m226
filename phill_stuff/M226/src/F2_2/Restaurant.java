package F2_2;

/*
 * Beschreibt ein Restaurnt des Zoos.
 * Das Restaurant verf�gt �ber einen Inventarwert sowie �ber
 * einen Typ und eine Bezeichnung und eine festgelegte Platzzahl.
 *
 */
public class Restaurant extends Gebaeude {

    private int plaetze;

    /**
     * Erzeugt ein Geb�ude-Objekt mit dem Typ und der Bezeichnung sowie dem Invebtarwert und der Platzzahl
     *
     * @param bez  Bezeichnung des Geb�udes
     * @param wert Inventarwert des Geb�udes
     */
    public Restaurant(String bez, float wert, int plaetze) {
        super("Restaurant", bez, wert);
        this.plaetze = plaetze;
    }
}
