public class Bank_Konto{

    // Attribute
    private float kontostand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    // Default Konstruktor
    public Bank_Konto(){
        // to do mit null initialisieren
        besitzer = null;
        kontostand = aktZinssatz = maxUnterdeckung = 0.0f;
    }
    // Konstruktor 1
    public Bank_Konto(float wert){
        this();
        kontostand = wert;
    }
    // Konstruktor 2
    public Bank_Konto(float wert, float zinssatz){
        this(wert);
        aktZinssatz = zinssatz;
    }
    // Konstruktor 3
    public  Bank_Konto(float wert, float zinssatz, float deckung){
        this(wert, zinssatz);
        maxUnterdeckung = deckung;
    }
    // Konstruktor 4
    public Bank_Konto(float wert, float zinssatz, float deckung, String person){
        this(wert, zinssatz, deckung);
        besitzer = person;
    }

     public void zeigeKontoInfo(){
        System.out.println("Besitzer : " + besitzer);
        System.out.println("Kontostand : " + kontostand);
        System.out.println("Zinssatz : " + aktZinssatz);
        System.out.println("Deckung : " + maxUnterdeckung);
         System.out.println();
    }

    public static void main(String[] args) {
        // Objekte
        Bank_Konto kontoLeer = new Bank_Konto();
        Bank_Konto kontoX = new Bank_Konto(1000, 5);
        Bank_Konto kontoMoritz = new Bank_Konto(500, 2.5f, 250, "Moritz");
        Bank_Konto kontoNadina = new Bank_Konto(970, 1.7f, 250, "Nadina");

        // call Method
        kontoLeer.zeigeKontoInfo();
        kontoX.zeigeKontoInfo();
        kontoMoritz.zeigeKontoInfo();
        kontoNadina.zeigeKontoInfo();

    }
}
