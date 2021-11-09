package D2_1;

/**
    Beschreibt einen Musiker, der ein Instrument spielt 
    und auf diesem T�ne erzeugt.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Musiker{
  
  private String name;
  private Instrument refToInstrument;
  
  public Musiker(String name, Instrument instrument){
    this.name = name;
    refToInstrument  = instrument;
  }
  
  public String getName(){
    return name;
  }
  
  /*
  Musiker spielt einen Ton
  */
  public void spielNote(char note){
    System.out.print(this.name + " spielt mit ");
    refToInstrument.spielNote(note);
  }
  
}