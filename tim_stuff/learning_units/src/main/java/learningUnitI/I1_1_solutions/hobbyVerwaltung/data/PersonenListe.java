package learningUnitI.I1_1_solutions.hobbyVerwaltung.data;


import java.util.Collections;
import java.util.Vector;

public class PersonenListe extends PersonAbstractTableModel {
	private static final long serialVersionUID = 5997470472233122461L;
    private final String[] tableTitel = {"Name", "Vorname", "Hobby"};
	private Vector<Person> personList;
	
	/**
	 * Erstellt eine Liste für Personen-Objekte.
	 * Der Liste können Objekte beigefügt (addPerson) und entfernt (removePerson)
	 * werden. 
	 * Für die graphische Ausgabe wir die Schnittstelle TableModel implementiert. 
	 * Somit ist sichergestellt, dass die Daten in tabellarischer Form angezeigt
	 * werden können.
	 * Die Liste kann nach Namen sortiert (sortPerson) werden.
	 */
	public PersonenListe(){
		personList = new Vector<Person>();
	}
	
	/**
	 * Diese Methode wird während der Initialisierung benötigt, um Person-Objekte 
	 * in der Liste einzufügen.
	 * Die Methode addPerson darf hier NICHT verwendet werden, da sie mit der
	 * graphischen Komponente (JTable) kommuniziert, sobald ein Wert eingefügt
	 * wird. Zum Zeitpunkt des Aufrufs von setListe sind aber die graphischen
	 * Komponenten noch nicht instanziert, was dann zu einer NullPointerException
	 * führen würde.
     *
	 * @param p	Person-Objekt das in die Liste eingefügt wird
	 */
	public void setList(Person p){
		personList.add(p);
	}
	
	/*
	 * Implementation der Methoden der Schnittstelle TableModel.
	 * Damit die Implementation einfacher ausfällt, wird von der Komfort-Klasse
	 * AbstracttableModel geerbt. Dadurch sind einige Implementation bereits 
	 * realisiert.
	 */
	
	/**
	 * Liefert den durch index markierten Spaltentitel.
	 * Die Titel sind in einem Attribut der Klasse definiert.
     *
	 * @param index Position in der Liste der Spaltentitel
	 * @return Spaltentitel
	 */
	@Override
	public String getColumnName(int index){
		return tableTitel[index];
	}
	
	/**
	 * Liefert die Anzahl Spalten in der Liste. 
	 * Die Grösse entspricht der Anzahl Elemente für die Spaltentitel.
     *
	 * @return Anzahl der Spalten
	 */
	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub
		return tableTitel.length;
	}

	/**
	 * Liefert die Anzahl der Einträge in der Liste (=Zeilenzahl)
     *
	 * @return Anzahl der Einträge
	 */
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return personList.size();
	}

	/**
	 * Liefert einen Zellenwert an der Position row/column.
     *
	 * @param row		Zeile die gelesen wird
	 * @param column	Spalte die gelesen wird
	 * @return Zellen-Wert an der Stelle row/column
	 */
	@Override
	public Object getValueAt(int row, int column) {
		// TODO Auto-generated method stub
		Person p = personList.get(row);
		switch (column){
            case 0:
                return p.getName();
            case 1:
                return p.getPrename();
            case 2:
                return p.getHobby();
		}
		return null;
	}

	/* 
	 * Implementation der Methoden aus PersonAbstractTableModel
	 * ACHTUNG:
	 * Jede Aktion hat eine Änderung der Daten zur Folge. Darum
	 * muss die graphische Komponente (JTable) informiert werden,
	 * damit sie die Ausgabe neu aufbauen kann.
	 * Diese Information erfolgt durch den Aufruf von
	 * this.fireTableDataChanged();
	 * Die Methode ist Teil der Oberklasse AbstractTableModel und
	 * dort vollständig implementiert.
	 */
	
	/**
	 * Entfernt das durch index markierte Person-Objekt aus der Liste der Personen.
	 * @param index Position in der Liste, die gelöscht wird
	 */
	@Override
	public void removePerson(int index) {
		personList.remove(index);
		this.fireTableDataChanged();
	}

	/**
	 * Fügt der Liste der Personen ein neues Person-Objekt p zu.
	 * @param p	Person-Objekt das in die Liste eingefügt wird
	 */
	@Override
	public void addPerson(Person p) {
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
