/**
   Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
   
   @author:   Alyssa Heimlicher
   @date:     21.09.2021
   @version:  1.0
*/
public class Auto implements AutoIF{
  
  // Deklaration der Attribute.
  // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels des Typen
  // FahrerIF sichergestellt.
  // Da ein Auto mehrere Fahrer kennt, verwenden wir hier einen Array auf
  // Fahrer-Objekte.
  private String nrSchild = "SG 999";
  private FahrerIF[] fahrer;
  private int cnt = 0;
  //....do it
  
  /**
  Initialisiert ein Auto-Objekt.
  Für die Zuordnung der Fahrer wird ein entsprechendes Array erstellt.
  */
  public Auto(){
    fahrer = new FahrerIF[5]; // für 5 Fahrer begrenzt
    cnt = 0;
  }


  // Implementation der Schnittstelle AutoIF
  //....do it

  @Override
  public void setFahrerRef(FahrerIF derFahrer) {

  }

  public String getNrSchild() {
    return nrSchild;
  }

  public void setNrSchild(String nrSchild) {
    this.nrSchild = nrSchild;
  }

  public FahrerIF[] getFahrer() {
    return fahrer;
  }

  public void setFahrer(FahrerIF[] fahrer) {
    this.fahrer = fahrer;
  }

  public int getCnt() {
    return cnt;
  }

  public void setCnt(int cnt) {
    this.cnt = cnt;
  }


  // Implementation der erweiterten Schnittstelle der Klasse
  // das sind Methoden, die im Interface nicht genannt wurden.
  //....do it
  
}