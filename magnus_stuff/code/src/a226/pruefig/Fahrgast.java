package a226.pruefig;

/**
 *
 * Es erstellt einen Fahrgast welcher einem Sitzplatz zugewiesen werden kann.
 *
 * @version 1.0 vom 02.11.2021
 * @author Magnus Götz
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

  // Anfang Methoden
  /**
     * Lieert den Namen des Fahrgastes.
     */
  public String getName() {
    return name;
  }
  
  /**
     * Liefert den Vornamen des Fahrgastes.
     */
  public String getVorname() {
    return vorname;
  }
  
  /**
     * Liefert den vollen Namen des Fahrgaste.
     */
  public String getFullName() {
    // TODO hier Quelltext einfügen
    return name + " " + vorname;
  }
  
  /** 
     * Weist demFahrgast ein Platz.Ojekt zu.
     */
  public void setBusPlatz(Platz platz){
    this.platz = platz;
  }
  
  /**
     * Gibt die Inf desFahrgastes inklsive der Sitzplatz-Nummer aus.
     */
  public void printInfos(){
     System.out.println(name + " " + vorname +" : Sitzplatz " + platz.getPlatzNummer());
  }

  // Ende Methoden
} // end of Fahrgast

