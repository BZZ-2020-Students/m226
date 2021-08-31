public class Bankkonto {

    private float  kontostand;
    private float  aktZinssatz;
    private float  maxUnterdeckung;
    private String besitzer;

    Bankkonto(){
        // Default
    }

    // 1 Zahlenwert mit 0.0f und String mit null initialisiert
    public Bankkonto(int i, int i1){
        kontostand     = 0.0f;
        aktZinssatz     = 0.0f;
        maxUnterdeckung = 0.0f;
        besitzer        = null; // Strin mit Nulll
    }

    // kontostand mit wert initialiseren
    public Bankkonto(float wert){
        this(1000, 5);
        kontostand = wert;
    }

    // aktZinssatz mit zinsatz initialisieren
    public Bankkonto(float wert, float zinssatz){
        this(wert);
        aktZinssatz = zinssatz;
    }

    // maxUnterdeckung mit deckung initialisieren
    public Bankkonto(float wert, float zinssatz, float deckung){
        this(wert, zinssatz);
        maxUnterdeckung = deckung;
    }

    // besitzer mit person initialisieren
    public Bankkonto(float wert, float zinssatz, float deckung, String person){
        this(wert, zinssatz, deckung);
        besitzer = person;
    }


    // Aufgabe 3 Methode KontoInfo anzeigen
    public void zeigeKontoInfo(){
        System.out.println("Besitzer: " + besitzer);
        System.out.println("Kontostand: " + kontostand);
        System.out.println("Zinssatz: " + aktZinssatz);
        System.out.println("Unterdeckung : " + maxUnterdeckung);
        System.out.println("\n");
    }

    // Aufgae 5 main Method emit 3 Referenzvariabeln
    public static void main(String[] args){
        Bankkonto kontoLeer, kontoX, kontoMoritz;

        // Aufabe 6 erzeugen von 3 Objekten
        kontoLeer   = new Bankkonto(1000, 5);
        kontoX      = new Bankkonto(1000, 5);
        kontoMoritz = new Bankkonto(234, 7.5f, 500, "Moritz");

        kontoLeer.zeigeKontoInfo();
        kontoX.zeigeKontoInfo();
        kontoMoritz.zeigeKontoInfo();
    }
}