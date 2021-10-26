/*
 * Beschreibt ein Restaurnt des Zoos. 
 * Das Restaurant verfügt über einen Inventarwert sowie über
 * einen Typ und eine Bezeichnung und eine festgelegte Platzzahl. 
 *
 */
public class Restaurant extends Gebaeude {
	
	private int plaetze;
	/**
	 * Erzeugt ein Gebäude-Objekt mit dem Typ und der Bezeichnung sowie dem Invebtarwert und der Platzzahl
	 * @param bez Bezeichnung des Gebäudes
	 * @param wert Inventarwert des Gebäudes
	 */
	public Restaurant(String bez, float wert, int plaetze){
		super("Restaurant", bez, wert);
		this.plaetze = plaetze;
	}	
}
