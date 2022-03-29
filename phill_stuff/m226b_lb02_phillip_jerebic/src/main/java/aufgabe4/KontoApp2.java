package aufgabe4;

public class KontoApp2{
  
  public static void main(String[] ars){
    
    KundenKonti konten = new KundenKonti();
    BankKonto   bk;
    
    bk = new BankKonto();
    bk.einlegen(350.0f);
    konten.addKonto(bk);
    //
    bk = new BankKonto();
    bk.einlegen(780.0f);
    konten.addKonto(bk);
    //
    bk = new Lohnkonto(150.0f);
    bk.einlegen(200.0f);
    konten.addKonto(bk);
    
    printout(konten.toString());
    
  }
  
  
  public static void printout(String meldung){
    System.out.println(meldung);
  }
}
