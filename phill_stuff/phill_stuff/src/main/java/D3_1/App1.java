package D3_1;

import java.sql.SQLOutput;

/**
   Beispiel f�r die Instanzierung von Klassen, die eine 
   "einseitige" Beziehung pflegen.
   (Objekt A kennt Objekt B aber nicht umgekehrt)
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class App1{
  
  public static void main(String[] args){
    
    Haus haus;
    Hausbesitzer besitzer;

    haus = new Haus();
    besitzer = new Hausbesitzer(haus);
    System.out.println(besitzer.meinhaus.getHausTyp());


    
  }
  
}