/**
  *
  * Applikation die einige Klasseninstanziert und Methodenaufrufe realisiert.
  *
  * @version 1.0 vom 20.12.2014
  * @author  René Probst
  */

public class GruempiApp {
  
  // Anfang Attribute
  // Ende Attribute
  
  // Anfang Methoden
  public static void main(String[] args) {
    // Ein paar Stammdaten erzeugen
    Kategorie k = new Kategorie ("Senioren 1", 3);
    Mannschaft m = new Mannschaft("the best one", k);
    Spieler s = new Spieler("Muster", "Max", 45, true);
    s.setIstCaptain(true);
    // Spieler der Mannschaft zuweisen

    try {
      m.addSpieler(s);
      m.addSpieler(new Spieler(" ", "Köbi", 44, true));
      m.addSpieler(new Spieler("Botteron", "Rene", 36, true));
      m.addSpieler(new Spieler("Peter", "Hans", 31, false));
      m.addSpieler(new Spieler("Müller", "Oli", 34, false));
      m.addSpieler(new Spieler("Jörg", "Kurt", 39, false));

    }catch (NullPointerException SpielerNameException){
      System.err.println("Error:" + SpielerNameException.getMessage());
    }

    // Mannschaftinfo ausgeben. Die Daten werden alle aus dem Mannschaft-Objekt
    // ausgelesen!
    String out = "Mannschaft : "+m.getName() + "\n";
    out += "\tKategorie    " + m.getKategorie().getBezeichnung() + "\n";
    out += "\tAnz. Spieler " + m.getAnzSpieler() + ", davon lizenziert " + m.getLizenzierteSpieler() + "\n\nSpielerliste\n-----------------------\n";
    for (int i=0; i < m.getAnzSpieler(); i++) {
      out += m.getSpieler(i).toString() + "\n";
    } // end of for
    System.out.println(out);
    
    // 
  }
  
  // Ende Methoden
} // end of GruempiApp
