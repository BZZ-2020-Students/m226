/**
 * Legt die Aufrufschnittstelle der Klasse Auto fest.
 * Das Interface wird benötigt, damit die Klasse Fahrer code-technisch
 * implementiert werden kann, da zwischen den Klassen Fahrer und Auto
 * eine zweiseitige Beziehung besteht.
 * <p>
 * Im Interface werden die zur Verfügung gestellten Methoden deklariert.
 * (OHNE Implementierung!)
 *
 * @Author: René Probst
 * @Date: 24.9.2014
 * @Version: 1.0
 */
public interface AutoIF {
    /**
     * Liefert die Refernez auf ein Objekt, welches das Interface FahrerIF
     * implementiert.
     *
     * @param derFahrer auf Objekt vom Typ Fahrer
     */
    public void setFahrerRef(FahrerIF derFahrer);
}