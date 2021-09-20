/**
   Klasse zur Applikationsausf�hrung (ohne Objektcharakter).
   Dient der Erzeugung der ben�tigten Objekte und der Regelung der
   Methodenaufrufe.
   
   @Author:   Amsler Nadina (shirin197)
   @Date:     13.09.2021
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Band{
  
  
  public static void main(String[] args){
    /* Referenz auf die benötigten Objekte für die Band */
    Instrument gitarre = new Instrument("Gitarre");
    Instrument klavier = new Instrument("Klavier");
    Musiker moritz = new Musiker("Moritz", gitarre);
    Musiker max = new Musiker("Max", klavier);
    
    /* Töne spielen */
    max.spielNote('a');
    moritz.spielNote('f');
  }
}