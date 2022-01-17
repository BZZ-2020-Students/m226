/**
   Beschreibt ein Musikinstrument, das einen Ton spielen kann.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Instrument{
  
  private String bezeichnung;
  
  public Instrument(String bez){
    bezeichnung = bez;
  }
  
  public String getBezeichnung(){
    return bezeichnung;
  }
  
  /*
  spielt den geforderten Ton
  */
  public void spielNote(char note){
    System.out.println(" " + getBezeichnung() + " die Note " + note);
  }
}