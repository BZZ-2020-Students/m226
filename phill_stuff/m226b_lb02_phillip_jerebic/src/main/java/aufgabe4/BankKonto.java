package aufgabe4;

import aufgabe1.KontoUeberzugEcxeption;

public class BankKonto {

    protected float saldo;

    public BankKonto(){

    }

    public void einlegen(float betrag){
        saldo += betrag;
    }

    public float beziehen(float betrag) throws KontoUeberzugEcxeption {
        if (betrag < saldo){
            saldo = saldo-betrag;
            return betrag;
        }else{
            throw new KontoUeberzugEcxeption(betrag,saldo);

        }

    }

    public float aktuellerSaldo(){
        return saldo;
    }
}
