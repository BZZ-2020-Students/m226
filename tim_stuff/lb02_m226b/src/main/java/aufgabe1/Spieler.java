package aufgabe1;

/**
 * Die Klasse representiet einen Fussballspieler/eine Fussballspielerin.
 * <p>
 * Ein Spieler wird durch Name und Vorname erfasst. Je nach Kategorie
 * sind Alter und Spiellizenz des Fussballverbands massgebend.<br>
 * Daher sind diese beiden Informationen auch zu erfassen.
 * </p>
 * <p>
 * Bei der erstmaligen Erfassung eines Spielers müssen alle Informationen
 * vorliegen. Es gibt hier keine alternativen Konstruktoren.
 * </p>
 *
 * @author René Probst
 * @author Irmler Tim
 * @version 1.1 vom 18.01.2022
 */

public class Spieler {

    // Anfang Attribute
    private String name;
    private String vorname;
    private int alter;
    private boolean istLizenziert;
    private boolean istCaptain;
    // Ende Attribute

    /**
     * Initialisiert ein Spieler-Objekt mit allen wichtigen Werten.
     *
     * @param name          Name des Spielers
     * @param vorname       Vorname des Spielers
     * @param alter         Alter des Spielers
     * @param istLizenziert true, wenn eine Spiellizenz vorliegt
     */
    public Spieler(String name, String vorname, int alter, boolean istLizenziert) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
        this.istLizenziert = istLizenziert;
        this.istCaptain = false;
    }

    /**
     * Main Methode um das Programm zu starten und die Informationen zum erstellten Spieler auszugeben
     *
     * @param args
     */
    public static void main(String[] args) {
        Spieler spieler = new Spieler("Irmler", "Tim", 18, false);

        System.out.println(spieler);
    }

    // Anfang Methoden

    /**
     * Liefert den Namen des Spielers.
     *
     * @return Name des Spielers
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Namen des Spielers fest.
     *
     * @param name Name des Spielers
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Liefert den Vornamen des Spielers.
     *
     * @return Vorname des Spielers
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * Legt den Vornamen des  Spielers fest.
     *
     * @param vorname Vorname des Spielers
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * Liefert den vollen Namen (Name und Vorname) des Spielers.
     *
     * @return Namen und Vorname des Spielers
     */
    public String getVollenNamen() {
        return name + " " + vorname;
    }

    /**
     * Liefert das Alter des Spielers.
     *
     * @ return Alter des Spielers
     */
    public int getAlter() {
        return alter;
    }

    /**
     * Legt das Alter des Spielers fest.
     *
     * @param alter Alter des Spielers
     */
    public void setAlter(int alter) {
        this.alter = alter;
    }

    /**
     * Liefert den Status der Lizenzierung des Spielers.
     *
     * @return true, wenn der Spieler lizenziert ist, sonst false
     */
    public boolean getIstLizenziert() {
        return istLizenziert;
    }

    /**
     * Legt fest, ob ein Spieler beim Fussballverband lizenziert ist.
     * Der Wert true steht für lizenziert, dementsprechend false für
     * nicht lizenziert.
     *
     * @param istLizenziert true, wenn eine Spiellizenz vorliegt
     */
    public void setIstLizenziert(boolean istLizenziert) {
        this.istLizenziert = istLizenziert;
    }

    /**
     * Liefert den Status, ob der Spieler als Captain gilt.
     *
     * @return true, wenn der Spieler Captain des Teams ist, sonst false
     */
    public boolean getIstCaptain() {
        return istCaptain;
    }

    /**
     * Legt fest, ob der Spieler als Captain der Mannschaft fungiert.
     * Der Captain hat insofern einen besonderen Ststus, als er
     * die Mannschaft vor jedem Spiel melden muss. Zudem steht es dem
     * Captain zu, bei vermuteten Regelverstössen einen Rekurs an den
     * Veranstalter zu richten.
     *
     * @param istCaptain true, wenn Spieler Captain des Teams ist, sonst false
     */
    public void setIstCaptain(boolean istCaptain) {
        this.istCaptain = istCaptain;
    }

    /**
     * Gibt den Spieler mit den wichtigsten Informationen formatiert aus.
     *
     * @return formatierten String mit allen Infos
     */
    @Override
    public String toString() {
        return vorname + " " + name + " " + alter + " jährig" + "\n" +
                "\tlizenziert\t " + ((istLizenziert) ? "ja" : "nein") + "\n" +
                "\tCaptain\t\t " + ((istCaptain) ? "ja" : "nein");
    }

    // Ende Methoden
} // end of Spieler
