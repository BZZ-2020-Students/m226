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
    /* Referenz auf die ben�tigten Objekte f�r die Band */
    // ....to do
    Instrument gitarre = new Instrument("Gitarre");
    Instrument klavier = new Instrument("Klavier");

    Musiker moritz = new Musiker("Moritz", gitarre);
    Musiker max = new Musiker("Max", klavier);

    max.spielNote('a');
    moritz.spielNote('f');

    
    /* Erzeigen der Objekte */
    // ....to do: halten Sie sich an den Ablauf im Sequenzdiagramm
    
    
    /* T�ne spielen */
    // ....
  }
}