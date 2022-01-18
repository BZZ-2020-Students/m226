package aufgabe2;

/**
  *
  * Die Klasse beschreibt eine Mannschaft für das Grümpi.
  * <p>Eine Mannschaft ist über ihren (eindeutigen) Namen definiert. Zu dem
  * ist ihr eine Kategorie zugewiesen. Je nach Katrgorie dürfen eine 
  * begrenzte Anzahl der Spieler über eine Spielerlizenz des Fussballverbandes
  * verfügen.
  * </p>
  * <p>Weiter werden die aktuellen Spielpunkte aus dem Turnier eingetragen.
  * </p>
  *
  * @version 1.0 vom 07.10.2014
  * @author  René Probst 
  */

public class Mannschaft {
  
  // Anfang Attribute
  private String name;
  private Kategorie kategorie;
  private Spieler[] alleSpieler;
  private final int MAX_SPIELER_PRO_TEAM = 9;
  private int spielPunkte;
  private int spielerCounter = 0;
  private int lizenzierteSpieler = 0;
  // Ende Attribute
  
  /**
  * Initialisiert das Mannschaft-Objekt.
  * Es wird das Array für die Spieler erstellt.
  * @param name der Mannschaft
  * @param kategorie   die Kategorie in der die Mannschaft spielt
  */
  public Mannschaft(String name, Kategorie kategorie) {
    this.name = name;
    this.kategorie = kategorie;
    //
    alleSpieler = new Spieler[MAX_SPIELER_PRO_TEAM];
  }
  
  // Anfang Methoden
  /**
  * Fügt der Mannschaft einen Spieler zu.
  * <p>Es wird sichergestellt dass
  * <ol type="a">
  * <li>nicht mehr als 9 Spieler in der Mannschaft aufnahme finden</li>
  * <li>die Zahl der lizenzierten Spieler nicht überschritten wird</li>
  * </ol>
  * Kann der Spieler der Mannschaft zugefügt werden, wird dies mit
  * dem Wert true quittiert. Wird eine der Zusicherungen verletzt, wird
  * der Wert false geliefert.
  *
  * @param spieler   Das Spieler-Objekt, das zugefügt wird
  * @return true, wenn der Spieler zugefügt werden kann, sonst false
  */
  public boolean addSpieler(Spieler spieler) {
    // noch Platz im Team
    if (spielerCounter < MAX_SPIELER_PRO_TEAM) {
      // lizenzierter Spieler? kann er noch aufgenommen werden?
      if (spieler.getIstLizenziert()) {
        if (lizenzierteSpieler < kategorie.getMaxAnzahlLizenzierteSpieler()) {
          //ok noch möglich
          alleSpieler[spielerCounter++] = spieler;
          lizenzierteSpieler++;
          return true;
        } // end of if
        else
          return false;
      } // end of if
      else{
        // ok ein "normaler" Spieler
        alleSpieler[spielerCounter++] = spieler;
        return true;
      }
    } // end of if
    else
      return false;
  }
  
  /**
  * Entfernt das Spieler-Objekt aus der Mannschaft.
  * @param spieler     Spieler-Objekt, das gelöscht wird
  */
  public void removeSpieler(Spieler spieler) {
    // umkopieren des Array
    Spieler[] tmp = new Spieler[MAX_SPIELER_PRO_TEAM];
    int tmpCount  = 0;
    //
    for (int i=0; i < spielerCounter; i++) {
      if (alleSpieler[i] != spieler) {
        // umkopieren
        tmp[tmpCount++] = alleSpieler[i];
      } // end of if
    } // end of for
    spielerCounter =  tmpCount;
    alleSpieler = tmp;
  }
  
  /**
  * Liefert das Kategorie-Objekt, das dieser Mannscahft zugewiesen ist.
  * @return Kategorie-Objekt
  */
  public Kategorie getKategorie() {
    return kategorie;
  }
  
  /**
  * Weist der Mannschaft ein Lategorie-Objekt zu.
  * @param kategorie     Kategorie-Objekt dieser Mannschaft
  */
  public void setKategorie(Kategorie kategorie) {
    this.kategorie = kategorie;
  }
  
  /**
  * Liefert den Namen der Mannschaft.
  * @return Name der Mannschaft
  */
  public String getName() {
    return name;
  }
  
  /**
  * Liefert die Spielpunkte der Mannschaft.
  * @return Spielpunkte der Mannschaft
  */
  public int getSpielPunkte() {
    return spielPunkte;
  }
  
  /**
  * Legt die aktuellen Spielpunkte der Mannschaft fest.
  * @param spielPunkte aktuelle Spielpunkte der Mannschaft
  */
  public void setSpielPunkte(int spielPunkte) {
    this.spielPunkte = spielPunkte;
  }
  
  /**
  * Liefert das durch index markierte Spieler-Objekt.
  * <p>Wenn der index auf einen ungültigen Wert verweist, wird an 
  * Stelle eines Spieler-Objekts der Wert null geliefert.
  * </p>
  * @param index     Stelle an der das Spieler-Objekt gelesen wird
  * @return Spiler-Objekt oder null, wenn der index ungültig ist
  */
  public Spieler getSpieler(int index) {
    if (index < spielerCounter) {
      return alleSpieler[index];
    } // end of if
    else
      return null;
  }
  
  /** 
  * Liefert die Anzah lder Spieler, die in dieser Mannschaft sind.
  * @return Anzahl der Spieler
  */
  public int getAnzSpieler() {
    return spielerCounter;
  }
  
  /**
    * Liefert die Anzahl der Spieler, die eine Spiellizenz besitzen.
    * @return Anzahl Spieler mit Spiellizenz
    */
  public int getLizenzierteSpieler() {
    return lizenzierteSpieler;
  }
  
  // Ende Methoden
} // end of Mannschaft
