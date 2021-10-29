package Zoo;
/*
 * Beschreibt ein Gebäude. Dazu wird der Typ des Gebäudes so wie eine
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
     * Erzeugt ein Gebäude-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
     *
     * @param typ  Typ des Gebaäudes
     * @param bez  Bezeichnung des Gebäudes
     * @param wert Inventarwert des Gebäudes
     */
    public Gebaeude(String typ, String bez, float wert) {
        gebaeudeTyp = typ;
        bezeichnung = bez;
        inventarWert = wert;
    }

    /**
     * liefert den Typ des Gebäudes
     *
     * @return Typ das Gebäudes
     */
    public String getGebaeudeTyp() {
        return gebaeudeTyp;
    }

    /**
     * liefert die Bezeichnung des Gebäudes
     *
     * @return Bezeichnung des Gebäudes
     */
    public String getGebaeudeBezeichnung() {
        return bezeichnung;
    }

    /**
     * liefert den Wert des Gebäudes
     *
     * @return Wert des Gebäudes
     */
    public float getInventarWert() {
        return inventarWert;
    }
}
