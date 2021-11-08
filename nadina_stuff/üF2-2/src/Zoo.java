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
	 * Weiter wird festgelegt, wieviele Tiere und wieviele Gebäude der Zoo hat.
	 *
	 * @param name        name des Zoos
	 * @param anzTiere    Anzahl Tiere, die der Zoo maximal aufnehmen kann
	 * @param anzGebaeude Anzahl der Gebäude des Zoos
	 */
	public Zoo(String name, int anzTiere, int anzGebaeude) {
		zooName = name;
		alleTiere = new Tier[anzTiere];
		alleGebaeude = new Gebaeude[anzGebaeude];
	}

	/**
	 * Liefert den Namen des Zoos
	 *
	 * @return Name des Zoos
	 */
	public String getZooName() {
		return zooName;
	}

	/**
	 * fügt dem Zoo ein Tier-Objekt zu.
	 *
	 * @param einTier
	 */
	public void addTier(Tier einTier) {
		alleTiere[tierCounter++] = einTier;
	}

	/**
	 * fügt dem Zoo ein Gebäude zu
	 *
	 * @param einGebaeude
	 */
	public void addGebaeude(Gebaeude einGebaeude) {
		alleGebaeude[gebaeudeCounter++] = einGebaeude;
	}

	/**
	 * Die toString-Methode liefert die Informationen zum Zoo
	 */
	public String toString() {
		return "Zoo : " + zooName + " mit " + gebaeudeCounter + " Gebäuden und " + tierCounter + " Tieren";
	}


	public void getInventar() {
		float fullinv = 0;

		for (int i = 0; i < tierCounter; i++) {
			fullinv += alleTiere[i].getInventarWert();
		}
		for(int i = 0; i < gebaeudeCounter; i++){
			fullinv += alleGebaeude[i].getInventarWert();
		}
		System.out.println("Inventarwert: "+fullinv);
}


	public static void main(String[] args) {


		// Löwe
		Loewe loewe = new Loewe("Alex", 1);

		// Pinguin
		Pinguin pinguin = new Pinguin("Pingu", 1);
		Pinguin pinguin1 = new Pinguin("Kowalski", 2);
		Pinguin pinguin2 = new Pinguin("Private", 3);
		Pinguin pinguin3 = new Pinguin("Rico", 4);
		Pinguin pinguin4 = new Pinguin("Skipper", 5);

		// Zebra
		Zebra zebra = new Zebra("Marty", 1);
		Zebra zebra1 = new Zebra("Marlene", 1);

		// Gebäude
		// Stall
		Stall stall = new Stall("Zebrastall", 5);

		// Becken
		Becken becken = new Becken("Pingubecken", 2);

		// Gehege
		Gehege gehege = new Gehege("Affengehege", 2);
		Gehege gehege1 = new Gehege("Pingugehege", 2);
		Gehege gehege2 = new Gehege("Zebragehege", 2);
		Gehege gehege3 = new Gehege("Löwengehege", 2);

		// Restaurant
		Restaurant restaurant = new Restaurant("Madagskar", 1, 70);

		// Zoo
		Zoo zoo = new Zoo("Nadina", 20,10);

		// Affe
		zoo.addTier(new Affe("Coco", 1));
		zoo.addTier(new Affe("Mason", 2));

		zoo.addTier(loewe);

		zoo.addTier(pinguin);
		zoo.addTier(pinguin1);
		zoo.addTier(pinguin2);
		zoo.addTier(pinguin3);
		zoo.addTier(pinguin4);

		zoo.addTier(zebra);
		zoo.addTier(zebra1);

		zoo.addGebaeude(stall);

		zoo.addGebaeude(becken);

		zoo.addGebaeude(gehege);
		zoo.addGebaeude(gehege1);
		zoo.addGebaeude(gehege2);
		zoo.addGebaeude(gehege3);

		zoo.addGebaeude(restaurant);

		System.out.println(zoo.toString());
		zoo.getInventar();

	}

}
