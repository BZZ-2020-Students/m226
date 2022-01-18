import java.sql.Array;

/**
  *
  * Die Klasse representiet einen Fussballspieler/eine Fussballspielerin.
  * <p>
  * Ein Spieler wird durch Name und Vorname erfasst. Je nach Kategorie
  * sind Alter und Spiellizenz des Fussballverbands massgebend.<br>
  * Daher sind diese beiden Informationen auch zu erfassen.
  * </p>
  * <p>
  * Bei der erstmaligen Erfassung eines Spielers müssen alle Informationen
  * vorliegen. Es gibt hier keine alternativen Konstruktoren.
  * </p>
  *
  * @version  18.01.2021
  * @author   Nadina Amsler
  */

public class Spieler {
  
  // Anfang Attribute
  private String name;
  private String vorname;
  private int alter;
  private boolean istLizenziert;
  private boolean istCaptain;
  // Ende Attribute
  
  /**
  * Initialisiert ein Spieler-Objekt mit allen wichtigen Werten.
  * @param name              Name des Spielers
  * @param vorname           Vorname des Spielers
  * @param alter             Alter des Spielers
  * @param istLizenziert     true, wenn eine Spiellizenz vorliegt
  */
  public Spieler(String name, String vorname, int alter, boolean istLizenziert) {
    this.name = name;
    this.vorname = vorname;
    this.alter = alter;
    this.istLizenziert = istLizenziert;
    this.istCaptain = false;
  }


  // Anfang Methoden
  /**
  * Legt den Namen des Spielers fest.
  * @param name       Name des Spielers
  */
  public void setName(String name) {
    this.name = name;
  }
  
  /**
  * Legt den Vornamen des  Spielers fest.
  * @param vorname       Vorname des Spielers
  */
  public void setVorname(String vorname) {
    this.vorname = vorname;
  }
  
  /**
  * Legt das Alter des Spielers fest.
  * @param alter       Alter des Spielers
  */
  public void setAlter(int alter) {
    this.alter = alter;
  }
  
  /**
  * Legt fest, ob ein Spieler beim Fussballverband lizenziert ist.
  * Der Wert true steht für lizenziert, dementsprechend false für 
  * nicht lizenziert.
  * @param istLizenziert    true, wenn eine Spiellizenz vorliegt   
  */
  public void setIstLizenziert(boolean istLizenziert) {
    this.istLizenziert = istLizenziert;
  }
  
  /**
    * Legt fest, ob der Spieler als Captain der Mannschaft fungiert.
    * Der Captain hat insofern einen besonderen Ststus, als er 
    * die Mannschaft vor jedem Spiel melden muss. Zudem steht es dem 
    * Captain zu, bei vermuteten Regelverstössen einen Rekurs an den
    * Veranstalter zu richten.
    * @param istCaptain       true, wenn Spieler Captain des Teams ist, sonst false
    */
  public void setIstCaptain(boolean istCaptain) {
    this.istCaptain = istCaptain;
  }
  
  /**
    * Liefert den Namen des Spielers.
    * @return Name des Spielers
    */
  public String getName() {
    return name;
  }
  
  /**
    * Liefert den Vornamen des Spielers.
    * @return Vorname des Spielers
    */
  public String getVorname() {
    return vorname;
  }
  
  /**
    * Liefert den vollen Namen (Name und Vorname) des Spielers.
    * @return Namen und Vorname des Spielers
    */
  public String getVollenNamen(){
    return name+" "+vorname;
  }
  
  /**
    * Liefert das Alter des Spielers.
    * @ return Alter des Spielers
    */
  public int getAlter() {
    return alter;
  }
  
  /**
    * Liefert den Status der Lizenzierung des Spielers.
    * @return true, wenn der Spieler lizenziert ist, sonst false
    */
  public boolean getIstLizenziert() {
    return istLizenziert;
  }
  
  /**
    * Liefert den Status, ob der Spieler als Captain gilt.
    * @return true, wenn der Spieler Captain des Teams ist, sonst false
    */
  public boolean getIstCaptain() {
    return istCaptain;
  }


  /**
   * tosString ->  Override
   * - richtig deklarieren
   * - implementiert
   * */

  @Override
  public String toString() {
    return "Spieler" + '\n' +
            "Name: " + name + ", " + '\n' +
            "Vorname: " + vorname + ", " + '\n' +
            "Alter: " + alter + ", " + '\n' +
            "IstLizenziert: " + istLizenziert + ", " + '\n' +
            "IstCaptain: " + istCaptain + '\n' +
            "------------------------------------------------------------------------------------------";
  }

  /**
   * main methode
   * - richtig deklarieren
   * - objekterzeugung
   * - ausgabe*/

  public static void main(String[] args) {
    Mannschaft mann = new Mannschaft("Tv Uster",new Kategorie("Handball", 2));
    Spieler spieler;
    spieler = new Spieler("Hans","Mark", 18, true);
    spieler = new Spieler("Amsler", "Nadina", 19, true);
    spieler= new Spieler("Rajkumar", "Thurika", 17, true);

    spieler.sortiereNotenNachWert();
    System.out.println(spieler);

  }

  public void sortiereNotenNachWert() {

  }

  // Ende Methoden
} // end of Spieler
