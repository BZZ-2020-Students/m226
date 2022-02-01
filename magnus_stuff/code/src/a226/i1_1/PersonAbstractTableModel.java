package a226.i1_1;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN


import javax.swing.table.AbstractTableModel;

/**
 * Die Klasse PersonAbstractTableModel erweitert die Klasse AbstractTableModel
 * aus Java-Swing um Funktionalit�ten f�r das Entfernen, Zuf�gen und Sortieren von
 * Objekten der Klasse Person.
 * 
 * Die Implementation der notwendigen Methoden aus AbstractTableModel 
 * erfolgen in der Unterklasse PersonenListe.
 * 
 * @author  Ren� Probst
 * @version 1.0
 * @date  30.12.2014
 *
 */

public abstract class PersonAbstractTableModel extends AbstractTableModel {
  private static final long serialVersionUID = 1L;

  
  /**
  * Entfernt das durch index markierte Person-Objekt aus der Liste der Personen.
  * @param index Position in der Liste, die gel�scht wird
  */
  public abstract void removePerson(int index);
  
  /**
  * F�gt der Liste der Personen ein neues Person-Objekt p zu.
  * @param p Person-Objekt das in die Liste eingef�gt wird
  */
  public abstract void addPerson(Person p);
  
  /**
  * Sortiert die Liste der Personen nach dem Namen der Personen.
  */
  public abstract void sortPerson();
  
}
