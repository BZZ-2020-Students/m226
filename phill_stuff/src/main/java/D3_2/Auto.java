package D3_2;

/**
   Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Auto implements AutoIF{

  // Deklaration der Attribute.
  // ACHTUNG: Die Referenz auf das Fahrer-Objekt wird mittels dem Typ
  //          FahrerIF sichergestellt.
  // Da ein Auto mehrer Fahrer kennt, verwenden wir hier einen Array auf
  // Fahrer-Objekte.
  private String nrSchild = "SG 999";

  private int cnt = 0;

  private FahrerIF[] fahrer;
  //....do it
  
  /**
  Initialisiert ein Auto-Objekt.
  Für die Zuordnung der Fahrre wird ein entsprechendes Array erstellt.
  */
  public Auto(){
    fahrer = new FahrerIF[5]; // für 5 Fahrer begrenzt
    cnt = 0;
  }

  public String getNrSchild() {
    return nrSchild;
  }

  public void setNrSchild(String nrSchild) {
    this.nrSchild = nrSchild;
  }

  @Override
  public void setFahrerRef(FahrerIF derFahrer) {
    fahrer[cnt] = derFahrer;
    cnt++;
  }
  // Implementation der Schnitttselle AutoIF
  //....do it
  
  
  // Implemtation der erweiterten Schnittstelle der Klasse
  // Das sind Methoden die im Interface nicht genannt wurden.
  //....do it
  
}