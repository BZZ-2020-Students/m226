package learningUnitC.C3_2;

/**
 * Demonstration des (sinnvollen) Einsatzes von statisch deklarierten
 * Variablen und Methoden am Beispiel des Singleton-Pattern.
 * Die Klasse SingletonStart dient der Programmausführung.
 *
 * @author Tim Irmler
 * @version V1.0
 * @since 31.08.2021
 */
public class SingletonTest {
    // Die Klasse dient einzig dazu, eine main-Methode bereitzustellen.
    //                                                                               +--------------------------------------+
    // In main werden 2 Objektreferenzen der Klasse Singleton                        ¦ main()                               ¦
    // erzeugt. Dazu wird die statische Methode getInstance("Text")                  ¦  +-----------------------------------+
    // ausgeführt.                                                                   ¦  ¦ erzeuge Objekt objA (mit Text A)  ¦
    // Um die Wirkung zu sehen, wird dann über beide Referenzen                      ¦  +-----------------------------------+
    // die Methode getComment() aufgerufen.                                          ¦  ¦ erzeuge Objekt objB (mit Text B)  ¦
    //                                                                               ¦  +-----------------------------------+
    //                                                                               ¦  ¦ gib Text von ObjA aus             ¦
    //                                                                               ¦  +-----------------------------------+
    //                                                                               ¦  ¦ gib Text von ObjB aus             ¦
    public static void main(String[] args) {                                       // +--+-----------------------------------+
        Singleton objA, objB;

        objA = Singleton.getInstance("Text A");
        objB = Singleton.getInstance("Text B");

        System.out.println("objA = " + objA.getComment());
        System.out.println("objB = " + objB.getComment());
    }

}