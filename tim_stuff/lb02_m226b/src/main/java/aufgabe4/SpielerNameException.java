package aufgabe4;

/**
 * Exception die geworfen wird wenn der Name eines Spielers leer ist!
 *
 * @author Irmler Tim
 * @version 1.0 vom 18.01.2022
 */
public class SpielerNameException extends Exception {
    /**
     * Default Konstruktor für die Exception welche die Fehlermeldung angibt
     */
    public SpielerNameException() {
        super("Der Name des Spielers darf nicht leer sein!");
    }
}
