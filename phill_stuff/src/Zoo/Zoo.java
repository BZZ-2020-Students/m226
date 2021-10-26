package Zoo;

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
    @Override
    public String toString() {
        return "Zoo : " + zooName + " mit " + gebaeudeCounter + " Gebäuden und " + tierCounter + " Tieren";
    }

    public void getInventar() {
        float inventar = 0;
        for (int i = 0; i < alleTiere.length; i++) {
            inventar += alleTiere[i].getInventarWert();
        }
        for (int i = 0; i < alleGebaeude.length; i++) {
            inventar += alleGebaeude[i].getInventarWert();
        }
        System.out.println("Inventarwert: " + inventar);

    }

    /* to do....
     * ergänzen Sie hier die main-Methode gemäss Aufgabenstellung F2-2
     */

    public static void main(String[] args) {
        Affe affe1 = new Affe("Franz", 3000);
        Affe affe2 = new Affe("Tom", 5000);
        Loewe loewe1 = new Loewe("Ryan", 50000);
        Pinguin pinguin1 = new Pinguin("Rico", 8000);
        Pinguin pinguin2 = new Pinguin("Privet", 8000);
        Pinguin pinguin3 = new Pinguin("Scipper", 8000);
        Pinguin pinguin4 = new Pinguin("quwaltzky", 8000);
        Pinguin pinguin5 = new Pinguin("junior", 8000);
        Zebra zebra1 = new Zebra("Marty", 9000);
        Zebra zebra2 = new Zebra("Marty Junior", 9000);
        Stall stall = new Stall("Stall", 500000);
        Becken becken = new Becken("Becken", 1000000);
        Gehege gehege1 = new Gehege("Löwengehege", 800000);
        Gehege gehege2 = new Gehege("Zebragehege", 800000);
        Gehege gehege3 = new Gehege("Affengehege", 800000);
        Gehege gehege4 = new Gehege("Hundegehege", 800000);
        Restaurant restaurant = new Restaurant("Restaurant", 1500000, 200);

        Zoo zoo = new Zoo("Phills Zoo", 10, 7);
        zoo.addTier(affe1);
        zoo.addTier(affe2);
        zoo.addTier(loewe1);
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

        zoo.getInventar();
    }

}
