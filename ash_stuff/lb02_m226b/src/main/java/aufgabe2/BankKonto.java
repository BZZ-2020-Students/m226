package aufgabe2;

public class BankKonto {
    protected float saldo;

    public void einlegen(float betrag) {
        saldo += betrag;
    }

    public float beziehen(float betrag) {
        try {
            if (betrag <= saldo) {
                saldo -= betrag;
            } else {
                throw new KontoUeberzugEcxeption(betrag, saldo);
            }
        } catch (KontoUeberzugEcxeption e) {
            System.out.println(e.getMessage());
        }

        return saldo;
    }

    public float aktuellerSaldo() {
        return saldo;
    }


}
