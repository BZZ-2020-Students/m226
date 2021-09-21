/**
 * Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
 *
 * @Author: bitte Namen ergänzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class Auto implements AutoIF {
    // Deklaration der Attribute.
    // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels dem Typ
    //          FahrerIF sichergestellt.
    // Da ein Auto mehrer Fahrer kennt, verwenden wir hier einen Array auf
    // Fahrer-Objekte.
    private FahrerIF[] fahrer;
    String nrSchild = "SG 999";
    int cnt = 0;

    /**
     * Initialisiert ein Auto-Objekt.
     * Für die Zuordnung der Fahrer wird ein entsprechendes Array erstellt.
     */
    public Auto() {
        fahrer = new FahrerIF[5]; // für 5 Fahrer begrenzt
        cnt = 1;
    }

    // Implementation der Schnitttselle AutoIF
    @Override
    public void setFahrerRef(FahrerIF derFahrer) {
        if (cnt <= fahrer.length) {
            fahrer[cnt] = derFahrer;
            System.out.println("Fahrer Nr " + cnt + " ist " + derFahrer.getName());
            cnt++;
        } else {
            System.out.println("reached max amount of Fahrer!");
        }
    }

    // Implemtation der erweiterten Schnittstelle der Klasse
    // Das sind Methoden die im Interface nicht genannt wurden.
    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public FahrerIF[] getFahrer() {
        return fahrer;
    }

    public void setFahrer(FahrerIF[] fahrer) {
        this.fahrer = fahrer;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }
}