/**
   Klasse zur Applikationsausf�hrung (ohne Objektcharakter).
   Dient der Erzeugung der ben�tigten Objekte und der Regelung der
   Methodenaufrufe.
   
   @Author:   Amsler Nadina (shirin197)
   @Date:     13.09.2021 / Überarbeitet: 26.09.2021
   @Version:  beginnend mit V2.0 die Versionierung nachf�hren
*/
public class Band{


  public static void main(String[] args){
    /* Referenz auf die benötigten Objekte für die Band */
    // ....to do
    Instrument gitarre;
    Instrument klavier;

    Musiker moritz;
    Musiker max;

    /* Erzeigen der Objekte */
    // ....to do: halten Sie sich an den Ablauf im Sequenzdiagramm
    gitarre = new Instrument("Gitarre");
    klavier = new Instrument("Klavier");

    moritz = new Musiker("Moritz", gitarre);
    max = new Musiker("Max", klavier);

    moritz.spielNote('a');
    max.spielNote('f');

    /* Töne spielen */

  }
}