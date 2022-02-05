package aufgabe4;

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

    public float aktuellerSaldo(){
        return saldo + maxNegativerBezug;
    }

    public float getUeberzugBetrag(){
        return maxNegativerBezug;
    }
}
