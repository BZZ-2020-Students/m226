package aufgabe3;

public class Lohnkonto extends BankKonto {
    private float maxNegativerBezug;

    public Lohnkonto(float maxNegativerBezug) {
        this.maxNegativerBezug = maxNegativerBezug;
    }

    public float beziehen(float betrag) throws KontoUeberzugEcxeption {

            if(betrag <= maxNegativerBezug){
                saldo -= betrag;
            }else{
                throw new KontoUeberzugEcxeption(betrag,saldo);
            }


        return saldo;
    }

    public float getUeberzugBetrag(){
        return maxNegativerBezug;
    }
}
