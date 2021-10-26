package f22;

/*
 * Beschreibt ein Zebra mit der Art und dem Namen
 */
public class Zebra extends Tier{

	/**
	 * Erzeugt ein Zebra-Objekt und weist dem Tier einen Namen zu
	 * @param name des Zebras
	 * @param wert Wert des Tiers
	 */
	public Zebra(String name, float wert){
		super("Zebra", name, wert);
	}
}