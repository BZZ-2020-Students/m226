/**
  Definiert einen Fahrer, der ein Objekt vom Typ Auto referenziert.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Fahrer implements FahrerIF{

    private AutoIF auto;
    private String name;


    public Fahrer(AutoIF auto){
        this.auto = auto;
    }

    public Fahrer( AutoIF auto, String name){
        this(auto);
        this.name = name;
        auto.setFahrerRef(this);
    }


    public void setName(String name) {
        this.name = name;
    }

    // implementation der Schnittstelle FahrerIF
    @Override
    public String getName() {
        return name;
    }

}