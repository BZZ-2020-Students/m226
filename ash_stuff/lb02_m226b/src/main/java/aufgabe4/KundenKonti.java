package aufgabe4;

import java.util.Vector;

public class KundenKonti {
    private Vector<BankKonto> kundenKonten;

    public KundenKonti() {
        kundenKonten = new Vector<>();
    }

    public void addKonto(BankKonto konto){
     kundenKonten.add(konto);
    }

    public void removeKonto(int i){
        kundenKonten.remove(i);
    }

    public int getSize(){
        return kundenKonten.size();
    }

    @Override
    public String toString() {
        String message = "Liste der Konten ("+ getSize() +") \n ";
        for (int i = 0; i < getSize(); i++) {
            message += "Konto Nr. " + i + " Saldo = " + kundenKonten.get(i).aktuellerSaldo()+ "\n";
        }
        return message;
    }
}
