package f22;

/*
 * Beschreibt ein Gehege f�r die Tiere des Zoos. 
 * Das Gehege verf�gt �ber einen Inventarwert sowie �ber
 * einen Typ und eine Bezeichnung. 
 *
 */
public class Gehege extends Gebaeude {
	
	/**
	 * Erzeugt ein Geb�ude-Objekt mit dem Typ und der Bezeichnung
	 * @param bez Bezeichnung des Geb�udes
	 * @param wert Inventarwert des Geb�udes
	 */
	public Gehege(String bez, float wert){
		super("Gehege", bez, wert);
	}	
}
