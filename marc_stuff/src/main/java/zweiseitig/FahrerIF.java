package zweiseitig;

/**
   Legt die Aufrufschnittstelle der Klasse Fahrer fest.
   Das Interface wird ben�tigt, damit die Klasse Auto code-technisch
   implementiert werden kann, da zwischen den Klassen Auto und Fahrer 
   eine zweiseitige Beziehung besteht.
   
   Im Interface werden die zur Verf�gung gestellten Methoden deklariert.
   (OHNE Implementierung!)

   
   @Author:   Ren� Probst
   @Date:     24.39.2014
   @Version:  1.0
*/
public interface FahrerIF{
  
  
  /**
  Liefert den Namen des Fahrers.
  @return Name des Fahrers
  */
  public String getName();
}