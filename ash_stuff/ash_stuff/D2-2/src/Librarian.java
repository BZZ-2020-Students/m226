/**
 * Die Klasse repr?sentiert den Bibliotheker.
 * <p>Der Bibliothekar;
 * <ul>
 * <li>kauft neue B?cher ein, buyNewBook()</li>
 * <li>leiht B?cher dem Kunden aus, borrow_aBookToCustomer.....()</li>
 * <li>nimmt B?cher zur?ck, getABookFromCustomer</li>
 * <li>mahnt den Kunden, remindCustomer()</li>
 * <li>entfernt B?cher aus der Bibliothek, </li>
 * </ul></p>
 *
 * @Author: bitte Namen erg?nzen
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachf?hren
 */
public class Librarian {

    private Library library;

    /**
     * Initialisiert das Objekt. Dabei wird die Referenz zur Bibliothek
     * bekannt gemacht.
     */
    public Librarian(Library _library) {
        library = _library;
    }

    /**
     * Ein neues Buch mit Titel und ISBN-Nummer wird der Bibliothek beigefgt.
     * <p>Die Methode erstellt ein neues Buch und fügt es der Bibliothek zu.
     * Von der Bibliothek wird der Ablageort mitgeteilt, der dann dem Buch
     * ?bergeben wird.</p>
     *
     * @param title       des Buchs
     * @param isbn-Nummer des Buchs
     */
    public void buyNewBook(String title, String isbn) {
        // nach Sequenzdiagramm implementieren
        //....do it

        Book newBook = new Book(title, isbn);
        newBook.setPlacement(library.addBook(newBook));

    /* Hinweis:
    Aufrufe können ineinander geschachtelt sein. Es ist üblich, das
    so zu machen, dient aber nicht der übersichtlichkeit (vor allem
    nicht für Anfänger).
    */
    }

    /**
     * Das angefragte Buch wird dem Kunden ausgeliehen.
     * <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem
     * Fall gibt der Bibliothekar einen Hinweis aus. </p>
     *
     * @param title des Buchs
     * @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
     */
    public Book borrow_aBookToCustomerByTitle(String title) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
        // gezeigten Struktogrammden Code.
        Book book = library.searchBookByTitle(title);
        if (book == null) {
            System.out.println("Buch mit Titel " + title + " wurde nicht gefunden!");
        } else {
            String placement = book.getPlacement();
            return library.getBook(placement);
        }
        return book;
        //    +-----------------------------------------------------------------+
        //    ? suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      ?
        //    +-----------------------------------------------------------------+
        //    ? if (g?ltige Buchreferenez)                                      ?
        //    ?    --+----------------------------------------------------------+
        //    ? then ? > return Buchreferenz                                    ?
        //    ?    --+----------------------------------------------------------+
        //    ? else ? gib eine Meldung aus, dass Buchtitel nicht in Bibliothek ?
        //    ?      +----------------------------------------------------------+
        //    ?      ? > return null                                            ?
        //    +------+----------------------------------------------------------+
        //
        //....do it
    }

    /**
     * Das angefragte Buch wird dem Kunden ausgeliehen.
     * <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem
     * Fall gibt der Bibliothekar einen Hinweis aus. </p>
     *
     * @param isbn-Nummer des Buchs
     * @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
     */
    public Book borrow_aBookToCustomerByISBN(String isbn) {
        Book aBook = library.searchBookByISBN(isbn);
        if (aBook != null) {
            return aBook;
        } // end of if
        else {
            System.out.println("Das Buch mit der ISBN-Numemr'" + isbn + "' ist nicht verf?gbar");
            return null;
        }
    }


    /**
     * Das gelieferte Buch wird in die Bibliothek zur?ckgestellt.
     *
     * @param aBook auf das Buch
     */
    public void getABookFromCustomer(Book aBook) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
        //....do it
        library.putBook(aBook);
    }

    /**
     * Erinnert den Kunden, dass eine Ausleihe noch offen ist.
     *
     * @param theCustomer des Kunden, der gemahnt wird
     */
    public void remindCustomer(Customer theCustomer) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
        // Der Text "Kunde 'name' wird gemahnt, das Buch 'Titel' zur?ckzubringen" wird ausgegeben
        //....do it
        String name = theCustomer.getName();
        String book = theCustomer.getTitleOfBorrowedBook();
        theCustomer.remind();
        System.out.println();

    }


    /**
     * Entfernt ein Buch aus der Bibliothek.
     * Das Buch wird anhand seiner Referenz identifiziert.
     *
     * @param title des Buchs
     */
    public void removeBook(String title) {
        // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
        // gezeigten Struktogrammden Code.
        //
        //    +-----------------------------------------------------------------+
        //    ? suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      ?
        //    +-----------------------------------------------------------------+
        //    ? if (g?ltige Buchreferenz)                                       ?
        //    ?    --+----------------------------------------------------------+
        //    ? then ? entferen Buch aus der Bibliothek                         ?
        //    +------+----------------------------------------------------------+
        //
        //....do it

        Book aBook = library.searchBookByTitle(title);
        if(aBook != null){

        library.removeBook(aBook);
        }

    }
}