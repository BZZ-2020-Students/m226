package D3_2;

/**
   Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Auto implements AutoIF{
  private FahrerIF[] fahrer;
  private int cnt = 0;
  private String nrSchild = "SG 999";

  
  /**
  Initialisiert ein Auto-Objekt.
  F�r die Zuordnung der Fahrre wird ein entsprechendes Array erstellt.
  */
  public Auto(){
    fahrer = new FahrerIF[5]; // f�r 5 Fahrer begrenzt
    cnt = 0;
  }

  @Override
  public void setFahrerRef(FahrerIF var1) {
    fahrer[cnt] = var1;
    System.out.println("Fahrer " + cnt  + " ist: " +  var1.getName());
    cnt++;
  }

  public String getNrSchild(){
    return nrSchild;
  }

}