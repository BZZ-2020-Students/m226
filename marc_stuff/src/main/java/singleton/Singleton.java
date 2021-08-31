package singleton;

/**
   Demonstration des (sinnvollen) EInsatzes von statisch deklarierten
   Variablen und Methoden am Beispiel des Singleton-Pattern.
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Singleton{                                                         // +----------------------------------------+
  //                                                                               ¦            Singleton                   ¦
  // Die eigene Referenz in einer statischen Variable halten. Sie wird             +----------------------------------------+
  // mit null initialisert.                                                        ¦ + instance : Singleton                 ¦
  //
  // Eine Instanzvariable. Sie kann über das erzeugte Objekt                       ¦ - comment : String                     ¦
  // ausgelesen werden.                                                            +----------------------------------------+
  // Die Variable ist vom Typ String.                                              ¦                                        ¦
  //
  // Der Konstruktor der Klasse muss private deklariert werden. Somit ist          ¦ - Singleton(comment : String)          ¦
  // sichergestellt, dass er von keiner anderen Klasse her aufgerufen              ¦ + getInstance(s : String) : Singleton  ¦
  // werden kann.                                                                  ¦ + main (args : String[]) : void        ¦
  // Für das Testen erhält der Konstruktor einen Parameter vomn Typ String.        +----------------------------------------+
  // Dieser Parameter wird dann der Instanz-Variable (oben deklariert) 
  // zugewiesen.
  //
  // Die statische Methode getInstance() wird als Klassen-Methode                  +-----------------------------------+
  // aufgerufen. Sie prüft, ob eine Instanz der Klasse Singleton                   ¦ getInstance(String s)             ¦
  // vorliegt. Wenn nicht, wird die Klasse erzeugt.                                ¦  +--------------------------------+
  // Als Rückgabewert liefert die Methode die Referenz auf das                     ¦  ¦ if Objektreferenz = null       ¦
  // Objekt.                                                                       ¦  ¦    --+-------------------------+
  // Für das Testen erhält die Methode einen Parameter vom Typ String.            ¦  ¦ then ¦ erzeuge neues Objekt    ¦
  // Dieser Parameter wird dann dem Konstruktor übergeben.                         ¦  +------+-------------------------+
  // Die Methode getInstance liefert in jedem Fall eine gültige                    ¦  ¦ > Objetreferenz                ¦
  // Referenz auf (genau) ein Singleton-Objekt.                                    +--+--------------------------------+
  //
  // Liefert den Wert des Attributs comment (Kommentar)
  // Diese Methdeo ist hier nur aus Testzwecken. Sie greift auf die
  // Instanz-Variable (das Attribut) des Objekts zu.
  private final String comment;
  private static Singleton instance;

  private Singleton(String comment) {
    this.comment = comment;
  }

  public static Singleton getInstance(String s) {
    if (instance == null)
      instance = new Singleton(s);

    return instance;
  }

  public String getComment(){
    return comment;
  }
}