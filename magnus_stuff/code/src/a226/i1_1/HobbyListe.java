package a226.i1_1;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import javax.swing.*;

/**
 * Die Klasse stellt eine Liste von Hobby-Bezeichnungen bereit.
 * Die Liste ist "read-only", da in der aktuellen Fassung keine Objekte eingef�gt oder
 * entfernt werden k�nnen.
 * F�r die Anzeige der Liste in einer JList wird das Interface ListModel implementiert.
 * 
 * @author  Ren� Probst
 * @version 1.0
 * @date  30.12.2014
 *
 */
public class HobbyListe extends AbstractListModel<String> {
  private static final long serialVersionUID = 7326172834841098868L;
  
  private String[] hobby =  {"Skifahren", "Fussballspielen", "Singen", "N�hen", "Tanzen", "Lesen", "Partyorganisator"};
  
  public HobbyListe(){
  }

  @Override
  public int getSize() {
    return hobby.length;
  }

  @Override
  public String getElementAt(int index) {
    return hobby[index];
  }

  /*
   * Implementation der Methoden der Schnittstelle ListModel.
   * Damit die Implementation einfacher ausf�llt, wird von der Komfort-Klasse
   * AbstractListModel geerbt. Dadurch sind einige Implementation bereits 
   * realisiert.
   */
  
  // ERG�NZEN SIE HIER DIE METHODEN DES INTERFACE ListModel.
  // BEACHTEN SIE, DASS SIE NUR DIE ZWINGEND NOTWENDIGEN METHODEN (2 ST�CK)
  // IMPLEMENTIEREN
}
