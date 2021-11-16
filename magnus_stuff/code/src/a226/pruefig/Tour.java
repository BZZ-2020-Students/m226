package a226.pruefig;

/**
 *
 * Es managed die Tour mit der main funktion inbegriffen
 *
 * @version 1.0 vom 02.11.2021
 * @author Magnus Götz
 */

public class Tour {
  
  // Anfang Attribute
  private int tourNummer;
  private Bus bus;
  // Ende Attribute
  
  /**
     * Erzeugt ein Tour-Objekt mit einer Tour-Nummer.
     */
  public Tour(int tourNummer){
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
  public void setBus(Bus bus){
    this.bus = bus;
  }
  
  
  public static void main(String[] ars){
    Tour dieTour = new Tour(45);
    Bus derBus = new Bus(4, 15);

    dieTour.setBus(derBus);

    Fahrgast gast1 = new Fahrgast("Meier", "Max");

    derBus.addGast(12, gast1);
    derBus.printBusInfo();

    gast1.printInfos();

  }
  // Ende Methoden
} // end of Tour

