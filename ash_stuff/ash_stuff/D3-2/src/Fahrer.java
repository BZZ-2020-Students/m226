/**
  Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
   
   @Author:   Alyssa Heimlicher
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Fahrer implements FahrerIF{
    private AutoIF dasAuto;
    private String name;




    // Deklaration der Attribute
  // BEACHTEN: Hier wird auf den Typ AutoIF referenziert. Muss so sein, da sich
  //           sonst die Klasse nicht kompilieren lässt.
  //....do it

    // Deklaration des Konstruktors mit einem Paramter vom Typ AutoIF.
  // ACHTUNG: Es darf nicht auf Auto referenziert werden, da diese Klasse
  //          noch gar nicht existiert. Da Auto aber AutoIF implementieren
  //          wird, erfüllt sie alle Regeln der Schnittstelle.
  //....do it


    public Fahrer(AutoIF dasAuto) {
        this.dasAuto = dasAuto;
    }
  // Deklaration des Konstruktors mit Name des Fahrers und der Referenz auf
  // Ein Auto-Objekt (bez. Deklaration siehe oben)
  // 
  // nicht vergessen! Sie haben hier kaskadierte Konstruktoren.
  //....do it

    public Fahrer(AutoIF dasAuto, String name) {
        this.dasAuto = dasAuto;
        this.name = name;
        dasAuto.setFahrerRef(this);
    }
  
  // Implemntieren der Schnittstelle, wie sie durch das Interface FahrerIF
  // vorgegeben wird.
  //....do it

    @Override
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public AutoIF getDasAuto() {
        return dasAuto;
    }

    public void setDasAuto(AutoIF dasAuto) {
        this.dasAuto = dasAuto;
    }
    // Implementation der restlichen Methoden der Klasse
  //....do it
}