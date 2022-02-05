package aufgabe1;

public class Lohnkonto extends BankKonto{
    private float maxNegativerBezug;

    public Lohnkonto(float maxNegativerBezug) {
        this.maxNegativerBezug = maxNegativerBezug;
    }

    public float beziehen(float betrag){
        if(betrag <= maxNegativerBezug){
            saldo -= betrag;
        }
        return saldo;
    }

    public float getUeberzugBetrag(){
        return maxNegativerBezug;
    }
}
