package Zoo;

/*
 * Beschreibt einen Löwen mit der Art und dem Namen
 */
public class Loewe extends Tier {

    /**
     * Erzeugt ein Loewe-Objekt und weist dem Tier einen Namen zu
     *
     * @param name des Löwen
     * @param wert Wert des Tiers
     */
    public Loewe(String name, float wert) {
        super("Löwe", name, wert);
    }
}
