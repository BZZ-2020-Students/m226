package Zoo;

/*
 * Beschreibt ein Tier des Zoos mit der Art und dem Namen des Tiers.
 */
public class Tier {
    private String art;
    private String name;
    private float inventarWert;

    /**
     * Erzeugt ein Tier-Objekt mit der Tierart und dem Namen des Tiers.
     *
     * @param art
     * @param name
     */
    public Tier(String art, String name, float wert) {
        this.art = art;
        this.name = name;
        inventarWert = wert;
    }

    /**
     * liefert die Tierart
     *
     * @return Tierart
     */
    public String getTierArt() {
        return art;
    }

    /**
     * liefert den Namen des Tiers
     *
     * @return Tiername
     */
    public String getName() {
        return name;
    }

    /**
     * liefert den Inventarwert des Tiers
     *
     * @return Wert des Tiers
     */
    public float getInventarWert() {
        return inventarWert;
    }
}
