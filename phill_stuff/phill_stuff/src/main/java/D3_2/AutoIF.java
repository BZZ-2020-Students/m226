package D3_2;

/**
   Legt die Aufrufschnittstelle der Klasse Auto fest.
   Das Interface wird ben�tigt, damit die Klasse Fahrer code-technisch
   implementiert werden kann, da zwischen den Klassen Fahrer und Auto 
   eine zweiseitige Beziehung besteht.
   
   Im Interface werden die zur Verf�gung gestellten Methoden deklariert.
   (OHNE Implementierung!)
   
   @Author:   Ren� Probst
   @Date:     24.9.2014
   @Version:  1.0
*/
public interface AutoIF{
  public void setFahrerRef(FahrerIF derFahrer);
}