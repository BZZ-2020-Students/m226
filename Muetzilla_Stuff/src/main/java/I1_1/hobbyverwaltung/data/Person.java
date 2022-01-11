package I1_1.hobbyverwaltung.data;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE N�TIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN


/**
 * Die Klasse representiert eine I1_1.hobbyverwaltung.data.Person mit ihrem favorisierten Hobby.
 * F�r die Ausgabe soll eine Liste von Personen nach Name sortierbar sein.
 * Daher implemetiert die Klasse das Interface Comparable.
 *
 * @author Ren� Probst
 * @version 1.0
 * @date 30.12.2014
 */
public class Person implements Comparable<Person> {

    private String name, prename;
    private String hobby;

    /**
     * Erzeugt ein I1_1.hobbyverwaltung.data.Person-Objekt und initialisiert es mit den gelieferten Werten.
     *
     * @param name
     * @param prename
     * @param hobby
     */
    public Person(String name, String prename, String hobby) {
        this.name = name;
        this.prename = prename;
        this.hobby = hobby;
    }

    /**
     * Liefert den Namen der I1_1.hobbyverwaltung.data.Person.
     *
     * @return Name der I1_1.hobbyverwaltung.data.Person
     */
    public String getName() {
        return name;
    }

    /**
     * Liefert den Vornamen der I1_1.hobbyverwaltung.data.Person.
     *
     * @return Vorname der I1_1.hobbyverwaltung.data.Person
     */
    public String getPrename() {
        return prename;
    }

    /**
     * Liefert das Hobby der I1_1.hobbyverwaltung.data.Person.
     *
     * @return Hobby der I1_1.hobbyverwaltung.data.Person
     */
    public String getHobby() {
        return hobby;
    }

    /**
     * Setzt den Namen der I1_1.hobbyverwaltung.data.Person.
     *
     * @param name Name der I1_1.hobbyverwaltung.data.Person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Setzt den Vornamen der I1_1.hobbyverwaltung.data.Person.
     *
     * @param prename Vorname der I1_1.hobbyverwaltung.data.Person
     */
    public void setPrename(String prename) {
        this.prename = prename;
    }

    /**
     * Setzt das Hobby der I1_1.hobbyverwaltung.data.Person.
     *
     * @param hobby Hobby der I1_1.hobbyverwaltung.data.Person
     */
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public int compareTo(Person o) {
        return 0;
    }


    // IMPLEMENTIEREN SIE HIER DIE DURCH DAS INTERFACE Comparable
    // VERLANGTE METHODE!
}
