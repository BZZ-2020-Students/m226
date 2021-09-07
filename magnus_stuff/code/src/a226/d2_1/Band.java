package a226.d2_1;

/**
   Klasse zur Applikationsausführung (ohne Objektcharakter).
   Dient der Erzeugung der benötigten Objekte und der Regelung der
   Methodenaufrufe.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Band{
  
  
  public static void main(String[] args){
    Instrument gitarre = new Instrument("Gitarre");
    Instrument klavier = new Instrument("Klavier");

    Musiker moritz = new Musiker("Moritz", gitarre);
    Musiker max = new Musiker("Max", klavier);

    max.spielNote('a');
    moritz.spielNote('f');
  }
}