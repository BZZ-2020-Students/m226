package I1_1.HobbyListe.data;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN

import java.util.Vector;

/**
 * Die Klasse stellt eine Liste von Hobby-Bezeichnungen bereit.
 * Die Liste ist "read-only", da in der aktuellen Fassung keine Objekte eingef�gt oder
 * entfernt werden k�nnen.
 * F�r die Anzeige der Liste in einer JList wird das Interface ListModel implementiert.
 * 
 * @author  Rench Probst
 * @version 1.0
 * @date  30.12.2014
 *
 */
public class HobbyListe extends HobbyAbstractListModel {
  private static final long serialVersionUID = 7326172834841098868L;
  private Vector<String> hobbies;
  
//  private String[] hobby =  {"Skifahren", "Fussballspielen", "Singen", "N�hen", "Tanzen", "Lesen", "Partyorganisator"};
  
  public HobbyListe() {
  }

  @Override
  public void removeHobby(int index) {
    hobbies.remove(index);
  }

  @Override
  public void addHobby(String h) {
    hobbies.add(h);
  }


  @Override
  public int getSize() {
    return hobbies.size();
  }

  @Override
  public String getElementAt(int index) {
    if (index < hobbies.size())
      return hobbies.get(index);
    else
      return null;
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
