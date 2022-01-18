package aufgabe4;

/**
 * Applikation die einige Klasseninstanziert und Methodenaufrufe realisiert.
 *
 * @author René Probst
 * @author Irmler Tim
 * @version 1.1 vom 18.01.2022
 */

public class GruempiApp {

    // Anfang Attribute
    // Ende Attribute

    // Anfang Methoden
    public static void main(String[] args) {
        // Ein paar Stammdaten erzeugen
        Kategorie k = new Kategorie("Senioren 1", 3);
        Mannschaft m = new Mannschaft("the best one", k);
        Spieler s = null;
        try {
            s = new Spieler("Muster", "Max", 45, true);
        } catch (SpielerNameException e) {
            System.err.println(e.getMessage());
        }
        s.setIstCaptain(true);
        // Spieler der Mannschaft zuweisen
        try {
            m.addSpieler(s);
            m.addSpieler(new Spieler("Kuhn", "Köbi", 44, true));
            m.addSpieler(new Spieler("Botteron", "Rene", 36, true));
            m.addSpieler(new Spieler("Peter", "Hans", 31, false));
            m.addSpieler(new Spieler("Müller", "Oli", 34, false));
            m.addSpieler(new Spieler("Jörg", "Kurt", 39, false));
            m.addSpieler(new Spieler("", "    ", 39, false));
        } catch (SpielerNameException e) {
            System.err.println(e.getMessage());
        }

        // Mannschaftinfo ausgeben. Die Daten werden alle aus dem Mannschaft-Objekt
        // ausgelesen!
        System.out.println(mannschaftAusgabe(m));

        // alles wird jetzt sortiert ausgegeben!

        m.sortieren();
        System.out.println("JETZT SORTIERT\n");

        System.out.println(mannschaftAusgabe(m));
    }

    /**
     * formatiert einen String mit allen wichtigen Infos von einer Mannschaft und gibt diesen zurück
     *
     * @param m Die Mannschaft
     * @return den formatierten String
     */
    private static String mannschaftAusgabe(Mannschaft m) {
        StringBuilder out = new StringBuilder("Mannschaft : " + m.getName() + "\n");
        out.append("\tKategorie    ").append(m.getKategorie().getBezeichnung()).append("\n");
        out.append("\tAnz. Spieler ").append(m.getAnzSpieler()).append(", davon lizenziert ").append(m.getLizenzierteSpieler()).append("\n\nSpielerliste\n-----------------------\n");
        for (int i = 0; i < m.getAnzSpieler(); i++) {
            out.append(m.getSpieler(i).toString()).append("\n");
        } // end of for
        return out.toString();
    }

    // Ende Methoden
} // end of GruempiApp
