package library;

/**
  Hier werden alle ben�tigten Objekte erstellt
  <p>
     <ul>
         <li>theLibrary : Library (die Bibliothek)</li>
         <li>max        : Librarian (der Bibliothekar)</li>
         <li>moritz     : Customer (ein Kunde)</li>
         <li>ursula     : Customer (eine Kundin)</li>
     </ul>
  </p>
  
  <p>Das "Drehbuch" wird gem�ss Sequenzdiagramm der Aufgabenstellung
  implementiert.<br>
  Dazu braucht es auch Anpassungen in den Klassen
  <ul>
      <li>Librarian</li>
      <li>Customer</li>
  </ul>
  Die Klassen Library und Book m�ssen nicht bearbeitet werden.
  
  @Author:   bitte Namen erg�nzen
  @Date:     aktuelles Bearbeitungsdatum eintragen
  @Version:  beginnend mit V1.0 die Versionierung nachf�hren
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
    // B�cher in die Bibliothek einreihen
    System.out.println("Der Bibliothekar kauft neue B�cher und stellt diese in die Bibliothek");
    //...do it

    max.buyNewBook("Java f�r Dummies", "12769890q987e9");
    max.buyNewBook("Python f�r Dummies", "2w4easgtezrh1345q1");
    max.buyNewBook("JavaScript f�r Dummies", "5w6j7kr8u");
    max.buyNewBook("Kotlin f�r Dummies", "q3456awz5gr");
    max.buyNewBook("C++ f�r Dummies", "asdgfhjzrtz3t4");

    lib.printInventory();

    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // -------------
    // Teilauftrag 3
    //--------------
    // Kunden leihen ein Buch aus
    System.out.println("\n\nEs erfolgen Ausleihen");
    //....do it

    moritz.borrow_aBookByTitle("Java f�r Dummies");
    ursula.borrow_aBookByTitle("Python f�r Dummies");

    lib.printInventory();

    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    
    // -------------
    // Teilauftrag 4
    // -------------
    // Eine Kundin bringt das Buch selbst�ndig zur�ck.
    System.out.println("\n\nKundin "+ursula.getName()+" bringt ein Buch zur�ck");
    //....do it
    ursula.bringBackABook();
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    lib.printInventory();
    
    // Ein Kunde wird gemahnt und bringt dann sein Buch zur�ck
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
    max.removeBook("C++ f�r Dummies");
    
    // zur Kontrolle das Inventar der Bibliothek anzeigen
    //....do it
    lib.printInventory();
  }
}