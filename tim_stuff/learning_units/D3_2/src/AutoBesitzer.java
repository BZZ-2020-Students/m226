/**
 * Definiert einen Autobesitzer
 *
 * @Author: bitte Namen ergänzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class AutoBesitzer {
    // Deklaration der Attribute.
    // Diese Klasse kann ganz am Ende erstellt und kompiliert werden. Daher
    // ist es möglich, hier auf den Typ Auto (und nicht AutoIF) zu referenzieren.
    Auto meinAuto;

    // Konstruktor der Klasse. Er gibt das Nummernschild am StdOut aus.
    // Vergl. dazu die Übung D2-1.
    public AutoBesitzer(Auto meinAuto) {
        this.meinAuto = meinAuto;
        System.out.println("meinAuto.getNrSchild() = " + meinAuto.getNrSchild());
    }

    public Auto getMeinAuto() {
        return meinAuto;
    }

    public void setMeinAuto(Auto meinAuto) {
        this.meinAuto = meinAuto;
    }
}