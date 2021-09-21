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
  
  @Author:   Nadina Amsler (shirin197)
  @Date:     14.09.2021
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
    Library library;
    Librarian max;
    Customer moritz;
    Customer ursula;

    // Erzeugen der Objekte
    //....do it
    library = new Library();
    max = new Librarian(library);
    moritz = new Customer("Moritz", max);
    ursula = new Customer("Ursula", max);

    // -------------
    // Teilauftrag 2
    // -------------
    // Bücher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
    //...do it
    max.buyNewBook("Harry Potter 1", "23423");
    max.buyNewBook("Harry Potter 2", "23424");
    max.buyNewBook("Harry Potter 3", "23425");
    max.buyNewBook("Harry Potter 4", "23426");
    max.buyNewBook("Harry Potter 5", "23427");
    // zur Kontrolle das Inventar de 'r Bibliothek anzeigen
    //....do it4
    library.printInventory();
    ursula.bringBackABook();
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    moritz.borrow_aBookByTitle("Harry Potter 3");
    ursula.borrow_aBookByTitle("Harry Potter 5");
    // -------------
    // Teilauftrag 4
    // -------------
    // Eine Kundin bringt das Buch selbständig zurück.
    System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zurück");
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // Ein Kunde wird gemahnt und bringt dann sein Buch zurück
    System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
    //....do it
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
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