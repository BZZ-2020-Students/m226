package D3_2;

/**
   Beispiel der Instanzierung von Klassen mit einer zweiseitgen
   Beziehung.
   (Objekt A kennt Objekt B und umgekehrt
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class App2{
  
  public static void main(String[] args){
    
    // Auftrag 4a
    // ----------
    // Deklaration der 4 Objekte für Auto, Fahrer (2 Mal) und Besitzer
    //....do it
    Auto auto;
    Fahrer fahrer;
    AutoBesitzer autoBesitzer;
    // Auftrag 4b
    // ----------
    // gemäss Sequenzdiagramm die Instanzierung implementieren für
    // Auto und Autobesitzer.
    // ...do it
    auto = new Auto();
    autoBesitzer = new AutoBesitzer(auto);
    System.out.println(autoBesitzer.meinAuto.getNrSchild());
    // Auftrag 4c
    // ----------
    // beim ersten Fahrer (max) wird die eigene Referenz dem Auto-Objekt
    // innerhalb des Konstruktors übergeben 
    // --> siehe dazu Aufruf im Konstruktor der Klasse Fahrer
    //....do it
    Fahrer max = new Fahrer(auto,"Max");
    System.out.println(max.getName());
    // Auftrag 4d
    // ----------
    // beim zweiten Fahrer (mortitz) wird nur der Name dem Konstruktor 
    // mitgegeben.
    // Danach muss über die set-Merthode der Name explizit gesetzt werden.
    //....do it
    Fahrer moritz = new Fahrer(auto);
    moritz.setName("Moritz");
    auto.setFahrerRef(moritz);
    System.out.println(moritz.getName());
    // Und nun muss dem Auto-Objekt noch die Referenz von Moritz übergeben
    // werden.
    
  }
  
}