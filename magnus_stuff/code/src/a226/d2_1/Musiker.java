package a226.d2_1;

/**
    Beschreibt einen Musiker, der ein Instrument spielt 
    und auf diesem Töne erzeugt.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
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