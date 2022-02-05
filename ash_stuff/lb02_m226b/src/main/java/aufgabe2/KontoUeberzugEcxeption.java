package aufgabe2;

public class KontoUeberzugEcxeption extends Exception{
    public KontoUeberzugEcxeption(float betrag, float saldo){
        super("Der Betrag (" + betrag + ") ist grösser als der verfügbare Saldo ("+saldo+")");
    }
}
