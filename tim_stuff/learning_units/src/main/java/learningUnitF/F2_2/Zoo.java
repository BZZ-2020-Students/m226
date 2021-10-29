package learningUnitF.F2_2;

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

    public double getInventar() {
        double result = 0;
        for (int i = 0; i < tierCounter; i++) {
            result += alleTiere[i].getInventarWert();
        }
        for (int i = 0; i < gebaeudeCounter; i++) {
            result += alleGebaeude[i].getInventarWert();
        }
        return result;
    }

    public static void main(String[] args) {
        Affe affe1 = new Affe("monke", 69.420f);
        Affe affe2 = new Affe("monky", 420.69f);
        Loewe loewe = new Loewe("ich löwe", 12);

        Pinguin[] pinguine = new Pinguin[5];
        for (int i = 0; i < pinguine.length; i++) {
            pinguine[i] = new Pinguin("pinguin" + i, i);
        }

        Zebra zebra1 = new Zebra("zebri", 2);
        Zebra zebra2 = new Zebra("zebre", 2);

        Stall stall = new Stall("bez-stall", 4);

        Becken becken = new Becken("bez-becken", 123);

        Restaurant restaurant = new Restaurant("bez-restaurant", 1, 100);

        Zoo zoo = new Zoo("zoo", 10, 3);

        zoo.addGebaeude(stall);
        zoo.addGebaeude(becken);
        zoo.addGebaeude(restaurant);

        for (Pinguin pinguin : pinguine) {
            zoo.addTier(pinguin);
        }

        zoo.addTier(affe1);
        zoo.addTier(affe2);

        zoo.addTier(loewe);

        zoo.addTier(zebra1);
        zoo.addTier(zebra2);

        System.out.println("Zoo '" + zoo.getZooName() + "'");
        System.out.println(" Tiere:");
        System.out.println(" anzahl Tiere: " + zoo.tierCounter + " {");
        for (int i = 0; i < zoo.tierCounter; i++) {
            Tier tier = zoo.alleTiere[i];
            System.out.println("\t " + i + ": {");
            System.out.println("\t\t Art: " + tier.getTierArt());
            System.out.println("\t\t Name: " + tier.getName());
            System.out.println("\t\t Inventarwert: " + tier.getInventarWert());
            System.out.println("\t }");
        }
        System.out.println(" }");

        System.out.println(" Gebäude:");
        System.out.println(" anzahl Gebäude: " + zoo.gebaeudeCounter + " {");
        for (int i = 0; i < zoo.gebaeudeCounter; i++) {
            Gebaeude gebaeude = zoo.alleGebaeude[i];
            System.out.println("\t " + i + ": {");
            System.out.println("\t\t Typ: " + gebaeude.getGebaeudeTyp());
            System.out.println("\t\t Bezeichnung: " + gebaeude.getGebaeudeBezeichnung());
            System.out.println("\t\t Inventarwert: " + gebaeude.getInventarWert());
            System.out.println("\t }");
        }
        System.out.println(" }");

        System.out.println("Inventar Wert des Zoos '" + zoo.getZooName() + "' = " + zoo.getInventar());
    }
}
