package f22;

import java.math.BigDecimal;

/*
 * Die Klasse Zoo beschreibt den Zoo mit seinem Namen.
 *
 */
public class Zoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Einsiedler Zoo", 20, 6);

        Affe gengu = new Affe("Mastah Gengu", 50000);
        Affe george = new Affe("George", 35000);

        Loewe simba = new Loewe("Simba", 60000);

        Pinguin privet = new Pinguin("Private", 25000);
        Pinguin rico = new Pinguin("Rico", 24000);
        Pinguin kowalski = new Pinguin("Kowalski", 25500);
        Pinguin skipper = new Pinguin("Skipper", 24600);
        Pinguin penguin = new Pinguin("Pingun", 20000);

        Zebra marty = new Zebra("Marty", 69000);
        Zebra anita = new Zebra("Anita", 65000);

        Stall stall = new Stall("Zebrastall", 1_900_000);
        Gehege monkeyGehege = new Gehege("Affengehege", 4_000_000);
        Gehege lionGehege = new Gehege("Loewengehege", 3_500_000);
        Gehege pinguinGehege = new Gehege("Pinguingehege", 2_750_000);
		Becken pinguinBecken = new Becken("Pinguinbecken", 1_470_000);
        Gehege monkeyGehege2 = new Gehege("Zweites Affengehege", 3_000_000);

        zoo.addTier(gengu);
        zoo.addTier(george);
        zoo.addTier(simba);
        zoo.addTier(privet);
        zoo.addTier(rico);
        zoo.addTier(kowalski);
        zoo.addTier(skipper);
        zoo.addTier(penguin);
        zoo.addTier(marty);
        zoo.addTier(anita);

        zoo.addGebaeude(stall);
        zoo.addGebaeude(monkeyGehege);
        zoo.addGebaeude(monkeyGehege2);
        zoo.addGebaeude(lionGehege);
        zoo.addGebaeude(pinguinGehege);
		zoo.addGebaeude(pinguinBecken);

		zoo.getInventar();
    }


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

    public void getInventar() {
        float value = 0;
        for (Tier tier : alleTiere) {
            if (tier == null) continue;
            value += tier.getInventarWert();
        }

		for (Gebaeude gebaeude : alleGebaeude) {
			if (gebaeude == null) continue;

			value += gebaeude.getInventarWert();
		}

		System.out.println("Zoo : " + zooName + " mit " + alleGebaeude.length + " Gebäeuden und " + alleTiere.length + " Tieren");
		System.out.println("Inventarwert : " + new BigDecimal(value).toPlainString() + "CHF");
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



    /* to do....
     * ergänzen Sie hier die main-Methode gemäss Aufgabenstellung F2-2
     */

}
