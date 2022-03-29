package aufgabe4;

import java.util.Vector;

public class KundenKonti {
    private Vector<BankKonto> kundenkonten;

    public KundenKonti(){
        kundenkonten = new Vector<BankKonto>();
    }

    public void addKonto(BankKonto konto){
        kundenkonten.add(konto);
    }

    public void removeKonto(int i){
        kundenkonten.remove(i);
    }

    public int getSize(){
        return kundenkonten.size();
    }

    @Override
    public String toString() {
        StringBuilder returnstr = new StringBuilder("Liste der Konten (" + kundenkonten.size() + ")\n");
        for (int i = 0; i < kundenkonten.size(); i++) {
            returnstr.append("Konto Nr. ").append(i + 1).append(" Saldo = ").append(kundenkonten.get(i).saldo).append("\n");

        }

        return returnstr.toString();
    }
}
