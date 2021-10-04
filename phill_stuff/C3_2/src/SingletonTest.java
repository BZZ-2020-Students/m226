/**
   Demonstration des (sinnvollen) Einsatzes von statisch deklarierten
   Variablen und Methoden am Beispiel des Singleton-Pattern.
   Die Klasse SingletonStart dient der Programmausf�hrung.
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class SingletonTest{
  // Die Klasse dient einzig dazu, eine main-Methode bereitzustellen.
  //                                                                               +--------------------------------------+
  // In main werden 2 Objektreferenzen der Klasse Singleton                        � main()                               �
  // erzeugt. Dazu wird die statische Methode getInstance("Text")                  �  +-----------------------------------+
  // ausgef�hrt.                                                                   �  � erzeuge Objekt objA (mit Text A)  �
  // Um die Wirkung zu sehen, wird dann �ber beide Referenzen                      �  +-----------------------------------+
  // die Methode getComment() aufgerufen.                                          �  � erzeuge Objekt objB (mit Text B)  �
  //                                                                               �  +-----------------------------------+
  //                                                                               �  � gib Text von ObjA aus             �
  //                                                                               �  +-----------------------------------+
  //                                                                               �  � gib Text von ObjB aus             �
  public static void main(String[] args){                                       // +--+-----------------------------------+
    Singleton objA = Singleton.getInstance("mit Text A");
    System.out.println(objA.getComment());
    Singleton delete = Singleton.getInstance(null);
    Singleton objB = Singleton.getInstance("mit Text B");
    System.out.println(objB.getComment());

  }
  
}