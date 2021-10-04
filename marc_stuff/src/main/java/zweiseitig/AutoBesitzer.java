package zweiseitig;

/**
  Definiert einen Autobesitzer
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class AutoBesitzer{
    private Auto auto;

    public AutoBesitzer(Auto auto) {
        this.auto = auto;
        System.out.println("Nummerschild Auto: " + auto.getNrSchild());
    }
  
  // Deklaration der Atribute
  // Diese Klasse kann ganz am Ende erstellt und kompiliert werden. Daher
  // ist es m�glich, hier auf den Typ Auto (und nicht AutoIF) zu referenzieren.
  //....do it
  
  
  // Konstruktor der Klasse. Er gibt das Nummernschild am StdOut aus.
  // Vergl. dazu die �bung D2-1.
  //....do it
  
  
}