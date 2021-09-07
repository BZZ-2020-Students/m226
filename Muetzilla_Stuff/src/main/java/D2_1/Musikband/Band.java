package D2_1.Musikband;

/**
   Klasse zur Applikationsausf�hrung (ohne Objektcharakter).
   Dient der Erzeugung der ben�tigten Objekte und der Regelung der
   Methodenaufrufe.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Band{
  
  
  public static void main(String[] args){
    Instrument gitarre = new Instrument("Gitarre");
    Instrument klavier = new Instrument("Klavier");
    Musiker max = new Musiker("Max",klavier);
    Musiker moritz= new Musiker("Moritz", gitarre);
    max.spielNote('a');
    moritz.spielNote('f');

  }
}