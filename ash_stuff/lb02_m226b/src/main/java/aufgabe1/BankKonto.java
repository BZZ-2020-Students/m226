package aufgabe1;

public class BankKonto {
    protected float saldo;

    public void einlegen(float betrag){
        saldo += betrag;
    }

    public float beziehen(float betrag){
        if(betrag <= saldo){
            saldo -= betrag;
        }
        return saldo;
    }

    public float aktuellerSaldo(){
        return saldo;
    }


}
