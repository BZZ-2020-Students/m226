package D3_1;

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
    HausBesitzer besitzer;

    haus = new Haus();
    besitzer = new HausBesitzer(haus);
    
    
  }
  
}