package a226.f2_2;

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
	 * @param name name des Zoos
	 * @param anzTiere Anzahl Tiere, die der Zoo maximal aufnehmen kann
	 * @param anzGebaeude Anzahl der Gebäude des Zoos
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
	 * fügt dem Zoo ein Tier-Objekt zu.
	 * @param einTier
	 */
	public void addTier(Tier einTier){
		alleTiere[tierCounter++] = einTier;
	}
	
	/**
	 * fügt dem Zoo ein Gebäude zu
	 * @param einGebaeude
	 */
	public void addGebaeude(Gebaeude einGebaeude){
		alleGebaeude[gebaeudeCounter++] = einGebaeude;
	}

	public float getWert(){
		float wert = 0;
		for (Tier tier : alleTiere) {
			wert += tier.getInventarWert();
		}
		for (Gebaeude gebaeude : alleGebaeude) {
			wert += gebaeude.getInventarWert();
		}

		return wert;
	}

	/**
	 * Die toString-Methode liefert die Informationen zum Zoo
	 */
	public String getInventar(){
		return "Zoo : "+ zooName + " mit " + gebaeudeCounter +" Gebäuden und " +  tierCounter + " Tieren\nInventarwert: " + getWert();
	}

	public static void main(String[] args) {
		Affe affe1 = new Affe("Michael", 200);
		Affe affe2 = new Affe("Klars", 300);
		Loewe loewe = new Loewe("Mars", 500);
		Pinguin pinguin1 = new Pinguin("Lars", 200);
		Pinguin pinguin2 = new Pinguin("Hans", 200);
		Pinguin pinguin3 = new Pinguin("Frans", 200);
		Pinguin pinguin4 = new Pinguin("Lachs", 200);
		Pinguin pinguin5 = new Pinguin("Hanz", 200);
		Zebra zebra1 = new Zebra("Sara", 600);
		Zebra zebra2 = new Zebra("Vanessa", 450);
		Stall stall = new Stall("Stall1", 20000);
		Becken becken = new Becken("Becken1", 13000);
		Gehege gehege1 = new Gehege("Gehege1", 22000);
		Gehege gehege2 = new Gehege("Gehege2", 15000);
		Gehege gehege3 = new Gehege("Gehege3", 18000);
		Gehege gehege4 = new Gehege("Gehege4", 17000);
		Restaurant restaurant = new Restaurant("Restaurant1", 300000, 100);

		Zoo zoo = new Zoo("Zoo Zurich", 10, 7);

		zoo.addTier(affe1);
		zoo.addTier(affe2);
		zoo.addTier(loewe);
		zoo.addTier(pinguin1);
		zoo.addTier(pinguin2);
		zoo.addTier(pinguin3);
		zoo.addTier(pinguin4);
		zoo.addTier(pinguin5);
		zoo.addTier(zebra1);
		zoo.addTier(zebra2);
		zoo.addGebaeude(stall);
		zoo.addGebaeude(becken);
		zoo.addGebaeude(gehege1);
		zoo.addGebaeude(gehege2);
		zoo.addGebaeude(gehege3);
		zoo.addGebaeude(gehege4);
		zoo.addGebaeude(restaurant);

		System.out.println("Tiere:");
		for(int i = 0; i < zoo.alleTiere.length; i++){
			System.out.println(zoo.alleTiere[i].getName());
		}

		System.out.println("\nGebaeude:");
		for(int i = 0; i < zoo.alleGebaeude.length; i++){
			System.out.println(zoo.alleGebaeude[i].getGebaeudeBezeichnung());
		}

		System.out.println(zoo.getInventar());


	}

}
