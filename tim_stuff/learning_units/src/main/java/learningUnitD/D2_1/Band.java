package learningUnitD.D2_1;

/**
 * Klasse zur Applikationsausführung (ohne Objektcharakter).
 * Dient der Erzeugung der benötigten Objekte und der Regelung der
 * Methodenaufrufe.
 *
 * @author Tim Irmler
 * @Date: 07.09.2021
 * @Version: V1.0
 */
public class Band {
    public static void main(String[] args) {
        /* Referenz auf die benötigten Objekte für die Band */
        Instrument klavier, gitarre;
        Musiker moritz, max;

        /* Erzeugen der Objekte */
        klavier = new Instrument("Klavier");
        gitarre = new Instrument("Gitarre");
        moritz = new Musiker("Moritz", gitarre);
        max = new Musiker("Max", klavier);

        /* Töne spielen */
        max.spielNote('a');
        moritz.spielNote('f');
    }
}