package f22;

/*
 * Beschreibt ein Becken f�r die Tiere des Zoos. 
 * Das becken verf�gt �ber einen Inventarwert sowie �ber
 * einen Typ und eine Bezeichnung. 
 *
 */
public class Becken extends Gebaeude {
	
	/**
	 * Erzeugt ein Becken-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
	 * @param bez Bezeichnung des Geb�udes
	 * @param wert Inventarwert des Geb�udes
	 */
	public Becken(String bez, float wert){
		super("Becken", bez, wert);
	}	
}
