package a226.f2_2;

/*
 * Beschreibt einen Stall für die Tiere des Zoos. 
 * Der Stall verfügt über einen Inventarwert sowie über
 * einen Typ und eine Bezeichnung. 
 *
 */
public class Stall extends Gebaeude {
	
	/**
	 * Erzeugt ein Stall-Objekt mit dem Typ und der Bezeichnung sowie dem Inventarwert
	 * @param bez Bezeichnung des Gebäudes
	 * @param wert Inventarwert des Gebäudes
	 */
	public Stall(String bez, float wert){
		super("Stall", bez, wert);
	}	
}
