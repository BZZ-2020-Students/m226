package aufgabe3;

import java.util.Vector;

/**
 * Die Klasse beschreibt eine Mannschaft für das Grümpi.
 * <p>Eine Mannschaft ist über ihren (eindeutigen) Namen definiert. Zu dem
 * ist ihr eine Kategorie zugewiesen. Je nach Katrgorie dürfen eine
 * begrenzte Anzahl der Spieler über eine Spielerlizenz des Fussballverbandes
 * verfügen.
 * </p>
 * <p>Weiter werden die aktuellen Spielpunkte aus dem Turnier eingetragen.
 * </p>
 *
 * @author René Probst
 * @author Irmler Tim
 * @version 1.1 vom 18.01.2022
 */

public class Mannschaft {
    private final int MAX_SPIELER_PRO_TEAM = 9;
    // Anfang Attribute
    private String name;
    private Kategorie kategorie;
    private Vector<Spieler> alleSpieler;
    private int spielPunkte;
    private int lizenzierteSpieler = 0;
    // Ende Attribute

    /**
     * Initialisiert das Mannschaft-Objekt.
     * Es wird den Vector für die Spieler erstellt.
     *
     * @param name      der Mannschaft
     * @param kategorie die Kategorie in der die Mannschaft spielt
     */
    public Mannschaft(String name, Kategorie kategorie) {
        this.name = name;
        this.kategorie = kategorie;
        //
        alleSpieler = new Vector<>(MAX_SPIELER_PRO_TEAM);
    }

    public static void main(String[] args) {
        Mannschaft m = new Mannschaft("Tim team", new Kategorie("Sachen", 2));
        m.addSpieler(new Spieler("Irmler", "Tim", 18, false));
        m.addSpieler(new Spieler("Marc", "", 17, false));
        m.addSpieler(new Spieler("Ash", "", 19, false));

        for (int i = 0; i < m.getAnzSpieler(); i++) {
            Spieler spieler = m.getSpieler(i);
            System.out.println("spieler = " + spieler);
        }

        m.sortieren();
        System.out.println(".------");

        for (int i = 0; i < m.getAnzSpieler(); i++) {
            Spieler spieler = m.getSpieler(i);
            System.out.println(spieler);
        }
    }

    // Anfang Methoden

    /**
     * Methode welche die Spieler entsprechend der compare to methode in den Spielern sortiert
     */
    public void sortieren() {
        alleSpieler.sort(null);
    }

    /**
     * Fügt der Mannschaft einen Spieler zu.
     * <p>Es wird sichergestellt dass
     * <ol type="a">
     * <li>nicht mehr als 9 Spieler in der Mannschaft aufnahme finden</li>
     * <li>die Zahl der lizenzierten Spieler nicht überschritten wird</li>
     * </ol>
     * Kann der Spieler der Mannschaft zugefügt werden, wird dies mit
     * dem Wert true quittiert. Wird eine der Zusicherungen verletzt, wird
     * der Wert false geliefert.
     *
     * @param spieler Das Spieler-Objekt, das zugefügt wird
     * @return true, wenn der Spieler zugefügt werden kann, sonst false
     */
    public boolean addSpieler(Spieler spieler) {
        // noch Platz im Team
        if (alleSpieler.size() < MAX_SPIELER_PRO_TEAM) {
            // lizenzierter Spieler? kann er noch aufgenommen werden?
            if (spieler.getIstLizenziert()) {
                if (lizenzierteSpieler < kategorie.getMaxAnzahlLizenzierteSpieler()) {
                    //ok noch möglich
                    alleSpieler.add(spieler);
                    lizenzierteSpieler++;
                    return true;
                } // end of if
                else {
                    return false;
                }
            } // end of if
            else {
                // ok ein "normaler" Spieler
                alleSpieler.add(spieler);
                return true;
            }
        } // end of if
        else {
            return false;
        }
    }

    /**
     * Entfernt das Spieler-Objekt aus der Mannschaft.
     *
     * @param spieler Spieler-Objekt, das gelöscht wird
     */
    public void removeSpieler(Spieler spieler) {
        alleSpieler.remove(spieler);
    }

    /**
     * Liefert das Kategorie-Objekt, das dieser Mannscahft zugewiesen ist.
     *
     * @return Kategorie-Objekt
     */
    public Kategorie getKategorie() {
        return kategorie;
    }

    /**
     * Weist der Mannschaft ein Lategorie-Objekt zu.
     *
     * @param kategorie Kategorie-Objekt dieser Mannschaft
     */
    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    /**
     * Liefert den Namen der Mannschaft.
     *
     * @return Name der Mannschaft
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert die Spielpunkte der Mannschaft.
     *
     * @return Spielpunkte der Mannschaft
     */
    public int getSpielPunkte() {
        return spielPunkte;
    }

    /**
     * Legt die aktuellen Spielpunkte der Mannschaft fest.
     *
     * @param spielPunkte aktuelle Spielpunkte der Mannschaft
     */
    public void setSpielPunkte(int spielPunkte) {
        this.spielPunkte = spielPunkte;
    }

    /**
     * Liefert das durch index markierte Spieler-Objekt.
     * <p>Wenn der index auf einen ungültigen Wert verweist, wird an
     * Stelle eines Spieler-Objekts der Wert null geliefert.
     * </p>
     *
     * @param index Stelle an der das Spieler-Objekt gelesen wird
     * @return Spiler-Objekt oder null, wenn der index ungültig ist
     */
    public Spieler getSpieler(int index) {
        if (index < alleSpieler.size()) {
            return alleSpieler.get(index);
        } // end of if
        else {
            return null;
        }
    }

    /**
     * Liefert die Anzah lder Spieler, die in dieser Mannschaft sind.
     *
     * @return Anzahl der Spieler
     */
    public int getAnzSpieler() {
        return alleSpieler.size();
    }

    /**
     * Liefert die Anzahl der Spieler, die eine Spiellizenz besitzen.
     *
     * @return Anzahl Spieler mit Spiellizenz
     */
    public int getLizenzierteSpieler() {
        return lizenzierteSpieler;
    }

    // Ende Methoden
} // end of Mannschaft
