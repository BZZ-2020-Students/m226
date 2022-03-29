package I3_1.data;

/**
 * Die Klasse representiert eine Person mit ihrem favorisierten Hobby.
 * F�r die Ausgabe soll eine Liste von Personen nach Name sortierbar sein.
 * Daher implemetiert die Klasse das Interface Comparable.
 * 
 * @author	Ren� Probst
 * @version	1.0
 * @date	30.12.2014
 *
 */
public class Person implements Comparable<Person> {

	private String name, prename;
	private String hobby;
	
	/**
	 * Erzeugt ein Person-Objekt und initialisiert es mit den gelieferten Werten.
	 * @param name
	 * @param prename
	 * @param hobby
	 */
	public Person(String name, String prename, String hobby){
		this.name    = name;
		this.prename = prename;
		this.hobby   = hobby;
	}
	
	/**
	 * Liefert den Namen der Person.
	 * @return Name der Person
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Liefert den Vornamen der Person.
	 * @return Vorname der Person
	 */
	public String getPrename(){
		return prename;
	}
	
	/**
	 * Liefert das Hobby der Person.
	 * @return Hobby der Person
	 */
	public String getHobby(){
		return hobby;
	}
	
	/**
	 * Setzt den Namen der Person.
	 * @param name Name der Person
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Setzt den Vornamen der Person.
	 * @param prename Vorname der Person
	 */
	public void setPrename(String prename){
		this.prename = prename;
	}
	
	/**
	 * Setzt das Hobby der Person.
	 * @param hobby Hobby der Person
	 */
	public void setHobby(String hobby){
		this.hobby = hobby;
	}
	
	/**
	 * Implementation des Interface Comparable.
	 * Die Methode vergleicht zwei Person-Objekte bez�glich deren Namen.
	 * @param p Person-Objet f�r Vergleich
	 * @return -1, 0 oder +1 je nach Ergebnis des Vergleichs
	 */
	public int compareTo(Person p){
		return name.compareTo(p.getName());
	}
}
