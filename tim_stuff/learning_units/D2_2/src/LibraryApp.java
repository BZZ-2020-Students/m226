/**
 * Hier werden alle benötigten Objekte erstellt
 * <p>
 * <ul>
 * <li>theLibrary : Library (die Bibliothek)</li>
 * <li>max        : Librarian (der Bibliothekar)</li>
 * <li>moritz     : Customer (ein Kunde)</li>
 * <li>ursula     : Customer (eine Kundin)</li>
 * </ul>
 * </p>
 *
 * <p>Das "Drehbuch" wird gemäss Sequenzdiagramm der Aufgabenstellung
 * implementiert.<br>
 * Dazu braucht es auch Anpassungen in den Klassen
 * <ul>
 * <li>Librarian</li>
 * <li>Customer</li>
 * </ul>
 * Die Klassen Library und Book müssen nicht bearbeitet werden.
 *
 * @author Tim Irmler
 * @Date: 07.09.2021
 * @Version: V1.0
 */
public class LibraryApp {
    /*
    Hier den Ablauf implementieren
    */
    public static void main(String[] args) {
        // Teilauftrag 1
        // -------------
        // Deklaration der Hauptklassen
        Library library = new Library();

        // Erzeugen der Objekte
        Librarian max = new Librarian(library);

        Customer moritz = new Customer("Moritz", max);
        Customer ursula = new Customer("Ursula", max);

        // -------------
        // Teilauftrag 2
        // -------------
        // Bücher in die Bibliothek einreihen
        System.out.println("Der Bibliothekar kauft neue Bücher und stellt diese in die Bibliothek");
        max.buyNewBook("Buch1", "00001");
        max.buyNewBook("Buch2", "00002");
        max.buyNewBook("Buch3", "00003");
        max.buyNewBook("Buch4", "00004");
        max.buyNewBook("Buch5", "00005");

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        library.printInventory();

        // -------------
        // Teilauftrag 3
        //--------------
        // Kunden leihen ein Buch aus
        System.out.println("\n\nEs erfolgen Ausleihen");
        moritz.borrow_aBookByTitle("Buch2");
        ursula.borrow_aBookByTitle("Buch4");

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        library.printInventory();

        // -------------
        // Teilauftrag 4
        // -------------
        // Eine Kundin bringt das Buch selbständig zurück.
        System.out.println("\n\nKundin " + ursula.getName() + " bringt ein Buch zurück");
        ursula.bringBackABook();

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        library.printInventory();

        // Ein Kunde wird gemahnt und bringt dann sein Buch zurück
        System.out.println("\n\nEs folgt eine Mahnung an Kunde " + moritz.getName());
        max.remindCustomer(moritz);

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        library.printInventory();

        // -------------
        // Teilauftrag 5:
        // --------------
        //Der Bibliothekar entfernt ein Buch aus der Bibliothek
        System.out.println("\n\nDer Bibliothekar entfernt ein Buch aus der Bibliothek");
        max.removeBook("Buch1");

        // zur Kontrolle das Inventar der Bibliothek anzeigen
        library.printInventory();
    }
}