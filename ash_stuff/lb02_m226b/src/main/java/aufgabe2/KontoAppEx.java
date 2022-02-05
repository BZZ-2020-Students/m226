package aufgabe2;

public class KontoAppEx {
  
  public static void main(String[] ars) throws KontoUeberzugEcxeption {
    
    BankKonto bk= new BankKonto();
    Lohnkonto lk= new Lohnkonto(300.0f);
    
    printout("Normales Bankkonto");
    bk.einlegen(500.0f);
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("Bezug 350.-");
    bk.beziehen(350.0f);
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("versuchter Bezug 400.-");
    bk.beziehen(400.0f);
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("---");
    printout("Lohnkonto");
    lk.einlegen(500.0f);
    printout("Saldo = " + lk.aktuellerSaldo());
    printout("Bezug 300.-");
    lk.beziehen(300.0f);
    printout("Saldo = " + lk.aktuellerSaldo());
    printout("versuchter Bezug 400.-");
    lk.beziehen(400.0f);
    printout("Saldo = " + lk.aktuellerSaldo());
    
  }
  
  
  public static void printout(String meldung){
    System.out.println(meldung);
  }
}
