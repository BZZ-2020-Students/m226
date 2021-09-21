/**
   Demonstration des (sinnvollen) EInsatzes von statisch deklarierten
   Variablen und Methoden am Beispiel des Singleton-Pattern.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Singleton{                                                         // +----------------------------------------+
  //                                                                               �            Singleton                   �
  // Die eigene Referenz in einer statischen Variable halten. Sie wird             +----------------------------------------+
  // mit null initialisert.                                                        � + instance : Singleton                 �
  .....


  //
  // Eine Instanzvariable. Sie kann �ber das erzeugte Objekt                       � - comment : String                     �
  // ausgelesen werden.                                                            +----------------------------------------+
  // Die Variable ist vom Typ String.                                              �                                        �
          private String comment;
  .....
  //
  // Der Konstruktor der Klasse muss private deklariert werden. Somit ist          � - Singleton(comment : String)          �
  // sichergestellt, dass er von keiner anderen Klasse her aufgerufen              � + getInstance(s : String) : Singleton  �
  // werden kann.                                                                  � + main (args : String[]) : void        �
  // F�r das Testen erh�lt der Konstruktor einen Parameter vomn Typ String.        +----------------------------------------+
  // Dieser Parameter wird dann der Instanz-Variable (oben deklariert) 
  // zugewiesen.

  private Singelton(String strg){

  }
          public static void main(String[] args){

          }
  .....
  .....
  //
  // Die statische Methode getInstance() wird als Klassen-Methode                  +-----------------------------------+
  // aufgerufen. Sie pr�ft, ob eine Instanz der Klasse Singleton                   � getInstance(String s)             �
  // vorliegt. Wenn nicht, wird die Klasse erzeugt.                                �  +--------------------------------+
  // Als R�ckgabewert liefert die Methode die Referenz auf das                     �  � if Objektreferenz = null       �
  // Objekt.                                                                       �  �    --+-------------------------+
  // F�r das Testen erh�lt die Methode einen Parameter vom Typ String.            �  � then � erzeuge neues Objekt    �
  // Dieser Parameter wird dann dem Konstruktor �bergeben.                         �  +------+-------------------------+
  // Die Methode getInstance liefert in jedem Fall eine g�ltige                    �  � > Objetreferenz                �
  // Referenz auf (genau) ein Singleton-Objekt.                                    +--+--------------------------------+
  ......
  ......
  //
  // Liefert den Wert des Attributs comment (Kommentar)
  // Diese Methdeo ist hier nur aus Testzwecken. Sie greift auf die
  // Instanz-Variable (das Attribut) des Objekts zu.
  public String getComment(){
    return ......
  }
}