package learningUnitD.D3_1;

/**
 * Beispiel für die Instanzierung von Klassen, die eine
 * "einseitige" Beziehung pflegen.
 * (Objekt A kennt Objekt B aber nicht umgekehrt)
 *
 * @Author: Tim Irmler
 * @Date: 20.09.2021
 * @Version: V1.0
 */
public class App1 {

    public static void main(String[] args) {

        Haus haus;
        HausBesitzer besitzer;

        // gemäss Sequenzdiagramm die Instanzierung implementieren

        haus = new Haus();
        besitzer = new HausBesitzer(haus);
        System.out.println("besitzer.getMeinHaus().getType() = " + besitzer.getMeinHaus().getType());
    }

}