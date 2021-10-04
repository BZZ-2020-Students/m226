package D3_2;

/**
  Definiert einen Autobesitzer
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class AutoBesitzer{

    private Auto meinAuto;

    public AutoBesitzer(Auto auto){
        meinAuto = auto;
        System.out.println(auto.getNrSchild());
    }
  
}