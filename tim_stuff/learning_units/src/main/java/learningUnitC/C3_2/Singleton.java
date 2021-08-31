package learningUnitC.C3_2;

/**
 * Demonstration des (sinnvollen) Einsatzes von statisch deklarierten
 * Variablen und Methoden am Beispiel des Singleton-Pattern.
 *
 * @author Tim Irmler
 * @version V1.0
 * @since 31.08.2021
 */
public class Singleton {                                                         // +----------------------------------------+
    //                                                                               ¦            Singleton                   ¦
    // Die eigene Referenz in einer statischen Variable halten. Sie wird             +----------------------------------------+
    // mit null initialisert.                                                        ¦ + instance : Singleton                 ¦
    private static Singleton instance = null;

    // Eine Instanzvariable. Sie kann über das erzeugte Objekt                       ¦ - comment : String                     ¦
    // ausgelesen werden.                                                            +----------------------------------------+
    // Die Variable ist vom Typ String.                                              ¦                                        ¦
    private String comment;

    // Der Konstruktor der Klasse muss private deklariert werden. Somit ist          ¦ - Singleton(comment : String)          ¦
    // sichergestellt, dass er von keiner anderen Klasse her aufgerufen              ¦ + getInstance(s : String) : Singleton  ¦
    // werden kann.                                                                  ¦ + main (args : String[]) : void        ¦
    // Für das Testen erhält der Konstruktor einen Parameter vom Typ String.        +----------------------------------------+
    // Dieser Parameter wird dann der Instanz-Variable (oben deklariert)
    // zugewiesen.
    private Singleton(String comment) {
        this.comment = comment;
    }

    // Die statische Methode getInstance() wird als Klassen-Methode                  +-----------------------------------+
    // aufgerufen. Sie prüft, ob eine Instanz der Klasse Singleton                   ¦ getInstance(String s)             ¦
    // vorliegt. Wenn nicht, wird die Klasse erzeugt.                                ¦  +--------------------------------+
    // Als Rückgabewert liefert die Methode die Referenz auf das                     ¦  ¦ if Objektreferenz = null       ¦
    // Objekt.                                                                       ¦  ¦    --+-------------------------+
    // Für das Testen erhält die Methode einen Parameter vom Typ String.            ¦  ¦ then ¦ erzeuge neues Objekt    ¦
    // Dieser Parameter wird dann dem Konstruktor übergeben.                         ¦  +------+-------------------------+
    // Die Methode getInstance liefert in jedem Fall eine gültige                    ¦  ¦ > Objetreferenz                ¦
    // Referenz auf (genau) ein Singleton-Objekt.                                    +--+--------------------------------+
    static public Singleton getInstance(String comment) {
        if (instance == null) {
            instance = new Singleton(comment);
        }
        return instance;
    }

    // Liefert den Wert des Attributs comment (Kommentar)
    // Diese Methdeo ist hier nur aus Testzwecken. Sie greift auf die
    // Instanz-Variable (das Attribut) des Objekts zu.
    public String getComment() {
        return this.comment;
    }
}