/**
 * Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
 *
 * @Author: bitte Namen ergänzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class Fahrer implements FahrerIF {
    // Deklaration der Attribute
    // BEACHTEN: Hier wird auf den Typ AutoIF referenziert. Muss so sein, da sich
    //           sonst die Klasse nicht kompilieren lässt.
    Auto dasAuto;
    String name;

    // Deklaration des Konstruktors mit einem Paramter vom Typ AutoIF.
    // ACHTUNG: Es darf nicht auf Auto referenziert werden, da diese Klasse
    //          noch gar nicht existiert. Da Auto aber AutoIF implementieren
    //          wird, erfüllt sie alle Regeln der Schnittstelle.
    public Fahrer(Auto dasAuto) {
        this.dasAuto = dasAuto;
        dasAuto.setFahrerRef(this);
    }

    // Deklaration des Konstruktors mit Name des Fahrers und der Referenz auf
    // Ein Auto-Objekt (bez. Deklaration siehe oben)
    //
    // nicht vergessen! Sie haben hier kaskadierte Konstruktoren.
    public Fahrer(Auto dasAuto, String name) {
        this.dasAuto = dasAuto;
        this.name = name;
        dasAuto.setFahrerRef(this);
    }

    // Implementieren der Schnittstelle, wie sie durch das Interface FahrerIF
    // vorgegeben wird.
    @Override
    public String getName() {
        return this.name;
    }

    // Implementation der restlichen Methoden der Klasse
    public void setName(String name) {
        this.name = name;
    }

    public Auto getDasAuto() {
        return dasAuto;
    }

    public void setDasAuto(Auto dasAuto) {
        this.dasAuto = dasAuto;
    }
}