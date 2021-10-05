package zweiseitig;

/**
 * Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
 *
 * @Author: bitte Namen erg�nzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachf�hren
 */
public class Auto implements AutoIF {

    // Deklaration der Attribute.
    // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels dem Typ
    //          FahrerIF sichergestellt.
    // Da ein Auto mehrer Fahrer kennt, verwenden wir hier einen Array auf
    // Fahrer-Objekte.
    private FahrerIF[] fahrer;
    private final String nrSchild;
    private int cnt;
    //....do it

    /**
     * Initialisiert ein Auto-Objekt.
     * F�r die Zuordnung der Fahrre wird ein entsprechendes Array erstellt.
     */
    public Auto() {
        fahrer = new FahrerIF[5]; // f�r 5 Fahrer begrenzt
        nrSchild = "SG 999";
        cnt = 0;
    }

    @Override
    public void setFahrerRef(FahrerIF derFahrer) {
        this.fahrer[cnt++] = derFahrer;

        System.out.println("Neuer Autofahrer " + cnt + ": " + derFahrer.getName());
    }

    public String getNrSchild() {
        return nrSchild;
    }

    // Implementation der Schnitttselle AutoIF
    //....do it


    // Implemtation der erweiterten Schnittstelle der Klasse
    // Das sind Methoden die im Interface nicht genannt wurden.
    //....do it

}