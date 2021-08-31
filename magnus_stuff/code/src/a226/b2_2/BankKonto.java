package a226.b2_2;

public class BankKonto {
    private float kontostand;
    private float aktZinssatz;
    private float maxUnterdeckung;
    private String besitzer;

    public BankKonto(){
    }

    public BankKonto(float wert){
        kontostand = wert;
    }

    public BankKonto(float wert, float zinssatz){
        kontostand = wert;
        aktZinssatz = zinssatz;
    }

    public BankKonto(float wert, float zinssatz, float deckung){
        kontostand = wert;
        aktZinssatz = zinssatz;
        maxUnterdeckung = deckung;
    }

    public BankKonto(float wert, float zinssatz, float deckung, String person){
        kontostand = wert;
        aktZinssatz = zinssatz;
        maxUnterdeckung = deckung;
        besitzer = person;
    }

    public void zeigeKontoInfo(){
        System.out.println("BankKonto{" +
                "kontostand=" + kontostand +
                ", aktZinssatz=" + aktZinssatz +
                ", maxUnterdeckung=" + maxUnterdeckung +
                ", besitzer='" + besitzer + '\'' +
                '}');
    }

    public static void main(String[] args) {
        BankKonto kontoLeer;
        BankKonto kontoX;
        BankKonto kontoMoritz;

        kontoLeer = new BankKonto();
        kontoX = new BankKonto(1000, 5);
        kontoMoritz = new BankKonto(500, 2.5f, 250, "Moritz");
        kontoLeer.zeigeKontoInfo();
        kontoX.zeigeKontoInfo();
        kontoMoritz.zeigeKontoInfo();

    }

}
