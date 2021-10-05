package zweiseitig;

/**
   Beispiel der Instanzierung von Klassen mit einer zweiseitgen
   Beziehung.
   (Objekt A kennt Objekt B und umgekehrt
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class App2{
  
  public static void main(String[] args) {

    Auto auto = new Auto();
    AutoBesitzer besitzer = new AutoBesitzer(auto);

    Fahrer max = new Fahrer(auto, "max");
    Fahrer moritz = new Fahrer(auto);
    moritz.setName("moritz");
    auto.setFahrerRef(moritz);

  }
}