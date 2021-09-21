/**
   Definiert ein Auto, das ein Objekt vom Typ Fahrer referenziert.
   
   @Author:   Amsler Nadina (shirin197)
   @Date:     21.09.2021
   @Version:  V1
*/
public class Auto implements AutoIF{

  private FahrerIF[] fahrer;

  private String nrSchild = "SG 999";
  private int cnt = 0; // counter



  /**
  Initialisiert ein Auto-Objekt.
  Für die Zuordnung der Fahrer wird ein entsprechendes Array erstellt.
  */
  public Auto(){
    fahrer = new FahrerIF[5]; // für 5 Fahrer begrenzt
    cnt = 0;
  }


  // implementation der Schnittstelle AutoIF
  @Override
  public void setFahrerRef(FahrerIF derFahrer) {
    fahrer[cnt] = derFahrer;
    cnt++;

    System.out.println(cnt + " : " + derFahrer.getName());
  }

  public String getNrSchild(){
    return nrSchild;
  }
  
}