/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.11.2021
 * @author Nadina Amsler (shirin197)
 */

/**
  * Beschreibt ein Fahrgast-Objekt duch Nae und Vorname soie einem zugewiesenen
  * Platz.
 */
public class Fahrgast {
  
  // Anfang Attribute
  private String name;
  private String vorname;
  private Platz platz;
  // Ende Attribute
  
  /**
     * Erzeugt ein Fahrgast-Objekt mit Name und Vorname
     */
  public Fahrgast(String name, String vorname) {
    this.name = name;
    this.vorname = vorname;
  }

  public String getName() {
    return name;
  }

  public String getVorname() {
    return vorname;
  }

  public String getFullName() {
    return name + " " + vorname;
  }

  public void setBusPlatz(Platz platz){
    this.platz = platz;
  }

  public void printInfos(){
     System.out.println(name + " " + vorname +" : Sitzplatz " + platz.getPlatzNummer());
  }

}

