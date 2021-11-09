package D2_1;

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
    Instrument klavier;
    Instrument gitarre;
    Musiker max;
    Musiker moritz;

    gitarre = new Instrument("Gitarre");
    klavier = new Instrument("Klavier");
    moritz = new Musiker("Moritz", gitarre);
    max = new Musiker("Max", klavier);

    max.spielNote('a');
    moritz.spielNote('f');
    /* Erzeigen der Objekte */
    // ....to do: halten Sie sich an den Ablauf im Sequenzdiagramm
    
    
    /* T�ne spielen */
    // ....
  }
}