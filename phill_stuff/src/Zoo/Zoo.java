/*
 * Die Klasse Zoo beschreibt den Zoo mit seinem Namen.
 * 
 */
public class Zoo {
	private String zooName;
	private Tier[] alleTiere;
	private int tierCounter = 0;
	private Gebaeude[] alleGebaeude;
	private int gebaeudeCounter = 0;
	
	/**
	 * Erzeugt den Zoo und teilt ihm den Namen name zu.
	 * Weiter wird festgelegt, wieviele Tiere und wieviele Geb�ude der Zoo hat.
	 * @param name name des Zoos
	 * @param anzTiere Anzahl Tiere, die der Zoo maximal aufnehmen kann
	 * @param anzGebaeude Anzahl der Geb�ude des Zoos
	 */
	public Zoo(String name, int anzTiere, int anzGebaeude){
		zooName      = name;
		alleTiere    = new Tier[anzTiere];
		alleGebaeude = new Gebaeude[anzGebaeude];
	}
	
	/**
	 * Liefert den Namen des Zoos
	 * @return Name des Zoos
	 */
	public String getZooName(){
		return zooName;
	}
	
	/**
	 * f�gt dem Zoo ein Tier-Objekt zu.
	 * @param einTier
	 */
	public void addTier(Tier einTier){
		alleTiere[tierCounter++] = einTier;
	}
	
	/**
	 * f�gt dem Zoo ein Geb�ude zu
	 * @param einGebaeude
	 */
	public void addGebaeude(Gebaeude einGebaeude){
		alleGebaeude[gebaeudeCounter++] = einGebaeude;
	}
	
	/**
	 * Die toString-Methode liefert die Informationen zum Zoo
	 */
	public String toString(){
		return "Zoo : "+ zooName + " mit " + gebaeudeCounter +" Geb�uden und " +  tierCounter + " Tieren";
	}
	
	
	
	/* to do....
	 * erg�nzen Sie hier die main-Methode gem�ss Aufgabenstellung F2-2
	 */

}
