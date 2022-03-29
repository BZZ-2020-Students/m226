package aufgabe1;

public class KontoAppEx{
  
  public static void main(String[] ars){
    
    BankKonto bk= new BankKonto();
    Lohnkonto lk= new Lohnkonto(300.0f);
    
    printout("Normales Bankkonto");
    bk.einlegen(500.0f);
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("Bezug 350.-");
    try {
      bk.beziehen(350.0f);
    } catch (KontoUeberzugEcxeption e) {
      System.out.println(e.getMessage());
    }
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("versuchter Bezug 400.-");
    try {
      bk.beziehen(400.0f);
    } catch (KontoUeberzugEcxeption e) {
      System.out.println(e.getMessage());
    }
    printout("Saldo = " + bk.aktuellerSaldo());
    printout("---");
    printout("Lohnkonto");
    lk.einlegen(500.0f);
    printout("Saldo = " + lk.aktuellerSaldo());
    printout("Bezug 300.-");
    try {
      lk.beziehen(300.0f);
    } catch (KontoUeberzugEcxeption e) {
      System.out.println(e.getMessage());
    }
    printout("Saldo = " + lk.aktuellerSaldo());
    printout("versuchter Bezug 400.-");
    try {
      lk.beziehen(400.0f);
    } catch (KontoUeberzugEcxeption e) {
      System.out.println(e.getMessage());
    }
    printout("Saldo = " + lk.aktuellerSaldo());
    
  }
  
  
  public static void printout(String meldung){
    System.out.println(meldung);
  }
}
