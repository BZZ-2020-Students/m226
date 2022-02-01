package i1_1;// HIER DAS PACKAGE ANGEBEN

// HIER ALLE NÖTIGEN IMPORTE ANGEBEN, SOWOHL ZU
// DEN EIGENEN PAKETEN ALS AUCH JENEN AUS DER JAVA-BIBLIOTHEK
// STUDIEREN SIE DAZU DIE API DER VERWENDETEN KLASSEN


/**
 * Die Klasse representiert eine Person mit ihrem favorisierten Hobby.
 * Für die Ausgabe soll eine Liste von Personen nach Name sortierbar sein.
 * Daher implemetiert die Klasse das Interface Comparable.
 * 
 * @author  René Probst
 * @version 1.0
 * @date  30.12.2014
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

  @Override
  public int compareTo(Person o) {
    int ret = name.compareTo(o.name);
    if (ret == 0)
      return 0;
    return 1;
  }


  // IMPLEMENTIEREN SIE HIER DIE DURCH DAS INTERFACE Comparable 
  // VERLANGTE METHODE!
}
