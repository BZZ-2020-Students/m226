package I3_1.data;

import java.util.*;


public class PersonenListe extends PersonAbstractTableModel {
	private static final long serialVersionUID = 5997470472233122461L;

	private Vector<Person> personList;
	private final String[] tableTitel = {"Name", "Vorname", "Hobby"};
	
	/**
	 * Erstellt eine Liste f�r Personen-Objekte.
	 * Der Liste k�nnen Objekte beigef�gt (addPerson) und entfernt (removePerson)
	 * werden. 
	 * F�r die graphische Ausgabe wir die Schnittstelle TableModel implementiert. 
	 * Somit ist sichergestellt, dass die Daten in tabellarischer Form angezeigt
	 * werden k�nnen.
	 * Die Liste kann nach Namen sortiert (sortPerson) werden.
	 */
	public PersonenListe(){
		personList = new Vector<Person>();
	}
	
	/**
	 * Diese Methode wird w�hrend der Initialisierung ben�tigt, um Person-Objekte 
	 * in der Liste einzuf�gen.
	 * Die Methode addPerson darf hier NICHT verwendet werden, da sie mit der
	 * graphischen Komponente (JTable) kommuniziert, sobald ein Wert eingef�gt
	 * wird. Zum Zeitpunkt des Aufrufs von setListe sind aber die graphischen
	 * Komponenten noch nicht instanziert, was dann zu einer NullPointerException
	 * f�hren w�rde.
	 * @param p	Person-Objekt das in die Liste eingef�gt wird
	 */
	public void setList(Person p){
		personList.add(p);
	}
	
	/*
	 * Implementation der Methoden der Schnittstelle TableModel.
	 * Damit die Implementation einfacher ausf�llt, wird von der Komfort-Klasse
	 * AbstracttableModel geerbt. Dadurch sind einige Implementation bereits 
	 * realisiert.
	 */
	
	/**
	 * Liefert den durch index markierten Spaltentitel.
	 * Die Titel sind in einem Attribut der Klasse definiert.
	 * @param index Position in der Liste der Spaltentitel
	 * @return Spaltentitel
	 */
	@Override
	public String getColumnName(int index){
		return tableTitel[index];
	}
	
	/**
	 * Liefert die Anzahl Spalten in der Liste. 
	 * Die Gr�sse entspricht der Anzahl Elemente f�r die Spaltentitel.
	 * @return Anzahl der Spalten
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return tableTitel.length;
	}

	/**
	 * Liefert die Anzahl der Eintr�ge in der Liste (=Zeilenzahl)
	 * @return Anzahl der Eintr�ge
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return personList.size();
	}

	/**
	 * Liefert einen Zellenwert an der Position row/column.
	 * @param row		Zeile die gelesen wird
	 * @param column	Spalte die gelesen wird
	 * @return Zellen-Wert an der Stelle row/column
	 */
	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		Person p = personList.get(row);
		switch (column){
		case 0: return p.getName();
		case 1: return p.getPrename();
		case 2: return p.getHobby();
		}
		return null;
	}

	/* 
	 * Implementation der Methoden aus PersonAbstractTableModel
	 * ACHTUNG:
	 * Jede Aktion hat eine �nderung der Daten zur Folge. Darum
	 * muss die graphische Komponente (JTable) informiert werden,
	 * damit sie die Ausgabe neu aufbauen kann.
	 * Diese Information erfolgt durch den Aufruf von
	 * this.fireTableDataChanged();
	 * Die Methode ist Teil der Oberklasse AbstractTableModel und
	 * dort vollst�ndig implementiert.
	 */
	
	/**
	 * Entfernt das durch index markierte Person-Objekt aus der Liste der Personen.
	 * @param index Position in der Liste, die gel�scht wird
	 */
	@Override
	public void removePerson(int index) {
		// TODO Auto-generated method stub
		personList.remove(index);
		this.fireTableDataChanged();
	}

	/**
	 * F�gt der Liste der Personen ein neues Person-Objekt p zu.
	 * @param p	Person-Objekt das in die Liste eingef�gt wird
	 */
	@Override
	public void addPerson(Person p) {
		// TODO Auto-generated method stub
		personList.add(p);
		this.fireTableDataChanged();
	}
	
	/**
	 * Sortiert die Liste der Personen nach dem Namen der Personen.
	 */
	@Override
	public void sortPerson(){
		Collections.sort(personList);
		this.fireTableDataChanged();
	}
}
