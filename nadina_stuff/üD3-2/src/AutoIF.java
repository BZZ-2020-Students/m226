/**
   Legt die Aufrufschnittstelle der Klasse Auto fest.
   Das Interface wird ben�tigt, damit die Klasse Fahrer code-technisch
   implementiert werden kann, da zwischen den Klassen Fahrer und Auto 
   eine zweiseitige Beziehung besteht.
   
   Im Interface werden die zur Verf�gung gestellten Methoden deklariert.
   (OHNE Implementierung!)
   
   @Author:   Amsler Nadina (shirin197)
   @Date:     21.09.2021
   @Version:  1.0
*/
public interface AutoIF{
  /**
  Liefert die Refernez auf ein Objekt, welches das Interface FahrerIF
  implementiert.

  @param derFahrer auf Objekt vom Typ Fahrer
  */
  public void setFahrerRef(FahrerIF derFahrer);
}