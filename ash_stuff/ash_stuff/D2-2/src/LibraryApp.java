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
    Librarian max =  new Librarian(library);
    Customer moritz = new Customer("Moritz", max);
    Customer ursula = new Customer("Ursula", max);
    
    
    // -------------
    // Teilauftrag 2
    // -------------
    // Bücher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
    //...do it
    max.buyNewBook("Harry Potter1", "9780747532743");
    max.buyNewBook("Harry Potter2", "9788884516114");
    max.buyNewBook("Harry Potter3", "9780605953208");
    max.buyNewBook("Harry Potter4", "9780439139595");
    max.buyNewBook("Harry Potter5", "9780439567619");
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it
    moritz.borrow_aBookByTitle("Harry Potter1");
    ursula.borrow_aBookByTitle("Harry Potter2");
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
    max.removeBook("Harry Potter4");
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    library.printInventory();
  }
}