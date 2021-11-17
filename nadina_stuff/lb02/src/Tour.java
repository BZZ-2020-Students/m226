/**
 *
 * Beschreibung
 *
 * @version 02.11.2021
 * @author Nadina Amsler (shirin197)
 */

public class Tour {

  // Anfang Attribute
  private int tourNummer;
  private Bus bus;
  // Ende Attribute

  /**
   * Erzeugt ein Tour-Objekt mit einer Tour-Nummer.
   */
  public Tour(int tourNummer) {
    this.tourNummer = tourNummer;
  }

  // Anfang Methoden

  /**
   * Liefert die Tournummer.
   */
  public int getTourNummer() {
    return tourNummer;
  }

  /**
   * weist ein Bus-Objekt der Tour zu.
   */
  public void setBus(Bus bus) {
    this.bus = bus;
  }


  public static void main(String[] ars) {
    // die Tour
    Tour dieTour = new Tour(45);
    // Bus
     Bus derBus = new Bus(4, 15);

    // Gast
    Fahrgast gast1 = new Fahrgast("Meier", "Max");
    Fahrgast gast2 = new Fahrgast("Müller", "Moritz");
    Fahrgast gast3 = new Fahrgast("McIntire", "Rosa");
    Fahrgast gast4 = new Fahrgast("Meier", "Max");
    Fahrgast gast5 = new Fahrgast("Basini", "Roberto");


    derBus.printBusInfo();
    gast1.printInfos();
    gast2.printInfos();
    gast3.printInfos();
    gast4.printInfos();
    gast5.printInfos();

  }

}

