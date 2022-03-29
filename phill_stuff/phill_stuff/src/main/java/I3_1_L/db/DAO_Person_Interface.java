package I3_1_L.db;

import I3_1_L.data.Person;

import java.util.*;

/**
 * Legt die Schnittstelle für die Datenspeicherung der erfassten Personen-Objekte fest.
 * Die Daten werden ähnlich einer Datenbank pro Datensatz (pro Person-Objekt) verwaltet.
 * 
 * @author	René Probst
 */
public interface DAO_Person_Interface {
	
	/**
	 * Fügt ein Personen-Objekt p in der Datenbank ein.
	 * @param p Personen-Objekt das eingefügt wird
	 */
	public abstract void insertPerson(Person p);
	
	/**
	 * Entfernt ein Personen-Objekt p aus der Datenbank.
	 * @param p Personen-Objekt das gelöscht wird
	 */
	public abstract void removePerson(Person p);
	
	/**
	 * Liefert eine Datenstruktur mit allen Personen-Objekten der Datenbank.
	 * @return Vector mit allen Personen-Objekten
	 */
	public abstract Vector<Person> selectAll();

}
