/**
 * Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
 *
 * @Author: bitte Namen ergänzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class Fahrer implements FahrerIF {
    @Override
    public String getName() {
        return null;
    }

    // Deklaration der Attribute
    // BEACHTEN: Hier wird auf den Typ AutoIF referenziert. Muss so sein, da sich
    //           sonst die Klasse nicht kompilieren lässt.
    //....do it


    // Deklaration des Konstruktors mit einem Paramter vom Typ AutoIF.
    // ACHTUNG: Es darf nicht auf Auto referenziert werden, da diese Klasse
    //          noch gar nicht existiert. Da Auto aber AutoIF implementieren
    //          wird, erfüllt sie alle Regeln der Schnittstelle.
    //....do it


    // Deklaration des Konstruktors mit Name des Fahrers und der Referenz auf
    // Ein Auto-Objekt (bez. Deklaration siehe oben)
    //
    // nicht vergessen! Sie haben hier kaskadierte Konstruktoren.
    //....do it


    // Implemntieren der Schnittstelle, wie sie durch das Interface FahrerIF
    // vorgegeben wird.
    //....do it


    // Implementation der restlichen Methoden der Klasse
    //....do it
}