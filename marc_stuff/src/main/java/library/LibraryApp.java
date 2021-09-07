package library;

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
    
    // Erzeugen der Objekte
    //....do it

    Library lib = new Library();
    Librarian max = new Librarian(lib);
    Customer moritz = new Customer("Moritz", max);
    Customer ursula = new Customer("Ursula", max);

    // -------------
    // Teilauftrag 2
    // -------------
    // Bücher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
    //...do it

    max.buyNewBook("Java für Dummies", "12769890q987e9");
    max.buyNewBook("Python für Dummies", "2w4easgtezrh1345q1");
    max.buyNewBook("JavaScript für Dummies", "5w6j7kr8u");
    max.buyNewBook("Kotlin für Dummies", "q3456awz5gr");
    max.buyNewBook("C++ für Dummies", "asdgfhjzrtz3t4");

    lib.printInventory();

    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it

    moritz.borrow_aBookByTitle("Java für Dummies");
    ursula.borrow_aBookByTitle("Python für Dummies");

    lib.printInventory();

    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // -------------
    // Teilauftrag 4
    // -------------
    // Eine Kundin bringt das Buch selbständig zurück.
    System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zurück");
    //....do it
    ursula.bringBackABook();
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    lib.printInventory();
    
    // Ein Kunde wird gemahnt und bringt dann sein Buch zurück
    System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
    //....do it
    max.remindCustomer(moritz);
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    lib.printInventory();
    
    // -------------
    // Teilauftrag 5:
    // --------------    
    //Der Bibliothekar entfernt ein Buch aus der Bibliothek
    System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
    //....do it
    max.removeBook("C++ für Dummies");
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    lib.printInventory();
  }
}