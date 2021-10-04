package D3_1;

/**
   Beispiel für die Instanzierung von Klassen, die eine 
   "einseitige" Beziehung pflegen.
   (Objekt A kennt Objekt B aber nicht umgekehrt)
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class App1{
  
  public static void main(String[] args){
    
    Haus haus;
    HausBesitzer besitzer;
    
    // gemäss Sequenzdiagramm die Instanzierung implementieren
    // ...do it
    haus = new Haus();
    besitzer = new HausBesitzer(haus);
  }
  
}