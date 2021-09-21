package a226.d3_2;

/**
 * Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
 *
 * @Author: Magnus Götz
 * @Date: 21.09.2021
 * @Version: V1.0
 */
public class Fahrer implements FahrerIF {

    // Deklaration der Attribute
    // BEACHTEN: Hier wird auf den Typ AutoIF referenziert. Muss so sein, da sich
    //           sonst die Klasse nicht kompilieren lässt.
    //....do it
    private AutoIF dasAuto;
    private String name;


    // Deklaration des Konstruktors mit einem Paramter vom Typ AutoIF.
    // ACHTUNG: Es darf nicht auf Auto referenziert werden, da diese Klasse
    //          noch gar nicht existiert. Da Auto aber AutoIF implementieren
    //          wird, erfüllt sie alle Regeln der Schnittstelle.
    //....do it
    public Fahrer(Auto auto) {
        dasAuto = auto;
    }

    // Deklaration des Konstruktors mit Name des Fahrers und der Referenz auf
    // Ein Auto-Objekt (bez. Deklaration siehe oben)
    //
    // nicht vergessen! Sie haben hier kaskadierte Konstruktoren.
    //....do it
    public Fahrer(Auto auto, String name) {
        dasAuto = auto;
        this.name = name;
        auto.setFahrerRef(this);
    }

    // Implemntieren der Schnittstelle, wie sie durch das Interface FahrerIF
    // vorgegeben wird.
    //....do it
    @Override
    public String getName() {
        return name;
    }

    // Implementation der restlichen Methoden der Klasse
    //....do it
    public void setName(String name) {
        this.name = name;
    }
}