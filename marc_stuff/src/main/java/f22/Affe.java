package f22;

/*
 * Beschreibt einen Affen mit der Art und dem Namen
 */
public class Affe extends Tier{

	/**
	 * Erzeugt ein Affe-Objekt und weist dem Tier einen Namen zu
	 * @param name des Affen
	 * @param wert Wert des Tiers
	 */
	public Affe(String name, float wert){
		super("Affe", name, wert);
	}
}
