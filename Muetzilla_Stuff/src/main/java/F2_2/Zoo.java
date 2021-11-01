package F2_2;

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
     *
     * @param name        name des Zoos
     * @param anzTiere    Anzahl Tiere, die der Zoo maximal aufnehmen kann
     * @param anzGebaeude Anzahl der Geb�ude des Zoos
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
     * f�gt dem Zoo ein Tier-Objekt zu.
     *
     * @param einTier
     */
    public void addTier(Tier einTier) {
        alleTiere[tierCounter++] = einTier;
    }

    /**
     * f�gt dem Zoo ein Geb�ude zu
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
        return "Zoo : " + zooName + " mit " + gebaeudeCounter + " Geb�uden und " + tierCounter + " Tieren";
    }


    public static void main(String[] args) {
        Zoo zoo = new Zoo("Der grosse Zoo", 10, 7);
        zoo.addTier(new Affe("Bernd", 12.5f));
        zoo.addTier(new Affe("Ida", 12.5f));
        zoo.addTier(new Loewe("Simba", 25f));
        zoo.addTier(new Pinguin("Rico", 5.6f));
        zoo.addTier(new Pinguin("Skipper", 5.6f));
        zoo.addTier(new Pinguin("Kowalski", 5.6f));
        zoo.addTier(new Pinguin("Private", 5.6f));
        zoo.addTier(new Pinguin("Markus", 5.6f));
        zoo.addTier(new Zebra("Sibert", 17.4f));
        zoo.addTier(new Pinguin("Marcel", 17.4f));
        zoo.addGebaeude(new Stall("Grosser Zoostall", 2000));
        zoo.addGebaeude(new Becken("Grosses Becken", 3500));
        zoo.addGebaeude(new Gehege("Affengehege", 1500));
        zoo.addGebaeude(new Gehege("Loewengehege", 1500));
        zoo.addGebaeude(new Gehege("Pinguingehege", 1500));
        zoo.addGebaeude(new Gehege("Zebragehege", 1500));
        zoo.addGebaeude(new Restaurant("Grosses Restaurant", 1000, 20));

        zoo.getInventar();
    }

    public void getInventar() {
        float totalWert = 0;
        for (int i = 0; i < tierCounter; i++) {
            totalWert += alleTiere[i].getInventarWert();
        }
        for (int i = 0; i < gebaeudeCounter; i++) {
            totalWert += alleGebaeude[i].getInventarWert();
        }
        System.out.println(this);
        System.out.println("Der Totale Wert des Zoos ist: " + totalWert);
    }

}
