package F2_2;
/*
 * Beschreibt ein Geb�ude. Dazu wird der Typ des Geb�udes so wie eine
 * genauer Beschriebung festgehalten z.B.
 * Stall
 * Zebraunterstand
 */

public class Gebaeude {
    private String gebaeudeTyp;
    private String bezeichnung;
    private float inventarWert;

    /**
     * default-Konstruktor. Macht gar nichts.
     */
    public Gebaeude() {

    }

    /**
     * Erzeugt ein Geb�ude-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
     *
     * @param typ  Typ des Geba�udes
     * @param bez  Bezeichnung des Geb�udes
     * @param wert Inventarwert des Geb�udes
     */
    public Gebaeude(String typ, String bez, float wert) {
        gebaeudeTyp = typ;
        bezeichnung = bez;
        inventarWert = wert;
    }

    /**
     * liefert den Typ des Geb�udes
     *
     * @return Typ das Geb�udes
     */
    public String getGebaeudeTyp() {
        return gebaeudeTyp;
    }

    /**
     * liefert die Bezeichnung des Geb�udes
     *
     * @return Bezeichnung des Geb�udes
     */
    public String getGebaeudeBezeichnung() {
        return bezeichnung;
    }

    /**
     * liefert den Wert des Geb�udes
     *
     * @return Wert des Geb�udes
     */
    public float getInventarWert() {
        return inventarWert;
    }
}
