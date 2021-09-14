package house;

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
    
    Haus haus = new Haus("Landhaus");
    HausBesitzer besitzer = new HausBesitzer(haus);


    System.out.println(besitzer.getHouse().getHouseType());
  }


  private static class Haus {
    private String houseType;

    public Haus(String houseType) {
      this.houseType = houseType;
    }

    public String getHouseType() {
      return houseType;
    }

    public void setHouseType(String houseType) {
      this.houseType = houseType;
    }
  }

  private static class HausBesitzer {
    private Haus house;

    public HausBesitzer(Haus house) {
      this.house = house;
    }

    public Haus getHouse() {
      return house;
    }

    public void setHouse(Haus house) {
      this.house = house;
    }
  }
}