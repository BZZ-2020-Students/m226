/**
  Definiert einen Autobesitzer
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class AutoBesitzer{
  
  // Deklaration der Atribute
  // Diese Klasse kann ganz am Ende erstellt und kompiliert werden. Daher
  // ist es möglich, hier auf den Typ Auto (und nicht AutoIF) zu referenzieren.
  //....do it

    Auto meinAuto;


  
  // Konstruktor der Klasse. Er gibt das Nummernschild am StdOut aus.
  // Vergl. dazu die Übung D2-1.
  //....do it

    public AutoBesitzer(Auto auto){
        this.meinAuto = auto;
        System.out.println(auto.getNrSchild());
    }
  
}