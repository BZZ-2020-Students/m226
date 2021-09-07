package a226.d2_2;

/**
  Hier werden alle benötigten Objekte erstellt
  <p>
     <ul>
         <li>theLibrary : Library (die Bibliothek)</li>
         <li>max        : Librarian (der Bibliothekar)</li>
         <li>moritz     : Customer (ein Kunde)</li>
         <li>ursula     : Customer (eine Kundin)</li>
     </ul>
  </p>
  
  <p>Das "Drehbuch" wird gemäss Sequenzdiagramm der Aufgabenstellung
  implementiert.<br>
  Dazu braucht es auch Anpassungen in den Klassen
  <ul>
      <li>Librarian</li>
      <li>Customer</li>
  </ul>
  Die Klassen Library und Book müssen nicht bearbeitet werden.
  
  @Author:   bitte Namen ergänzen
  @Date:     aktuelles Bearbeitungsdatum eintragen
  @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class LibraryApp{
  
  
  /* 
  Hier den Ablauf implementieren
  */
  public static void main(String[] args){
    // Teilauftrag 1
    // -------------
    // Deklaration der Hauptklassen
    //....do it
    Library library = new Library();
    Librarian max = new Librarian(library);
    Customer moritz = new Customer("Moritz", max);
    Customer ursula = new Customer("Ursula", max);
    
    // Erzeugen der Objekte
    //....do it
    
    
    // -------------
    // Teilauftrag 2
    // -------------
    // Bücher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
    max.buyNewBook("Auto", "12453212-512");
    max.buyNewBook("Bus", "453425-156");
    max.buyNewBook("Flugzeug", "023116-249");
    max.buyNewBook("Motorrad", "11165419846-127");
    max.buyNewBook("Fahrrad", "4461534-468");
    //...do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it
    moritz.borrow_aBookByTitle("Auto");
    ursula.borrow_aBookByTitle("Bus");
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 4
    // -------------
    // Eine Kundin bringt das Buch selbständig zurück.
    System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zurück");
    //....do it
    ursula.bringBackABook();
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // Ein Kunde wird gemahnt und bringt dann sein Buch zurück
    System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
    //....do it
    max.remindCustomer(moritz);
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 5:
    // --------------    
    //Der Bibliothekar entfernt ein Buch aus der Bibliothek
    System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
  }
}