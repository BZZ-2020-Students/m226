package zweiseitig;

/**
  Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Fahrer implements FahrerIF{
    private final Auto auto;
    private String name;

    public Fahrer(Auto auto) {
        this.auto = auto;
    }

    public Fahrer(Auto auto, String name) {
        this.auto = auto;
        this.name = name;

        auto.setFahrerRef(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    // Deklaration der Attribute
  // BEACHTEN: Hier wird auf den Typ AutoIF referenziert. Muss so sein, da sich
  //           sonst die Klasse nicht kompilieren l�sst.
  //....do it
  
  
  // Deklaration des Konstruktors mit einem Paramter vom Typ AutoIF.
  // ACHTUNG: Es darf nicht auf Auto referenziert werden, da diese Klasse
  //          noch gar nicht existiert. Da Auto aber AutoIF implementieren
  //          wird, erf�llt sie alle Regeln der Schnittstelle.
  //....do it
  
  
  // Deklaration des Konstruktors mit Name des Fahrers und der Referenz auf
  // Ein Auto-Objekt (bez. Deklaration siehe oben)
  // 
  // nicht vergessen! Sie haben hier kaskadierte Konstruktoren.
  //....do it
  
  
  // Implemntieren der Schnittstelle, wie sie durch das Interface FahrerIF
  // vorgegeben wird.
  //....do it
  
  
  // Implementation der restlichen Methoden der Klasse
  //....do it
}