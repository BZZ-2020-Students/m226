package a226.d3_2;

/**
 * Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
 *
 * @Author: Magnus Götz
 * @Date: 21.09.2021
 * @Version: V1.0
 */
public class Auto implements AutoIF {

    // Deklaration der Attribute.
    // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels dem Typ
    //          FahrerIF sichergestellt.
    // Da ein Auto mehrer Fahrer kennt, verwenden wir hier einen Array auf
    // Fahrer-Objekte.
    private FahrerIF[] fahrer;
    private String nrSchild = "SG 999";
    private int cnt = 0;

    /**
     * Initialisiert ein Auto-Objekt.
     * Für die Zuordnung der Fahrre wird ein entsprechendes Array erstellt.
     */
    public Auto() {
        fahrer = new FahrerIF[5]; // für 5 Fahrer begrenzt
        cnt = 0;
    }

    @Override
    public void setFahrerRef(FahrerIF derFahrer) {
        if (cnt < fahrer.length) {
            this.fahrer[cnt] = derFahrer;
            cnt++;
        }
        System.out.println("Name: " + derFahrer.getName() + " Laufnummer: " + cnt);
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