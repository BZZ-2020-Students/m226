package D2_2;

/**
   Die Klasse repr�sentiert den Bibliotheker.
   <p>Der Bibliothekar;
   <ul>
       <li>kauft neue B�cher ein, buyNewBook()</li>
       <li>leiht B�cher dem Kunden aus, borrow_aBookToCustomer.....()</li>
       <li>nimmt B�cher zur�ck, getABookFromCustomer</li>
       <li>mahnt den Kunden, remindCustomer()</li>
       <li>entfernt B�cher aus der Bibliothek, </li>
   </ul></p>
   
   @Author:   bitte Namen erg�nzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachf�hren
*/
public class Librarian{
  
  private Library library;
  
  /**
  Initialisiert das Objekt. Dabei wird die Referenz zur Bibliothek
  bekannt gemacht.
  */
  public Librarian(Library _library){
    library = _library;
  }
  
  /**
  Ein neues Buch mit Titel und ISBN-Nummer wird der Bibliothek beigef�gt.
  <p>Die Methode erstellt ein neues Buch und f�gt es der Bibliothek zu.
  Von der Bibliothek wird der Ablageort mitgeteilt, der dann dem Buch
  �bergeben wird.</p>
  @param Titel des Buchs
  @param ISBN-Nummer des Buchs
  */
  public void buyNewBook(String title, String isbn){
    Book aBook  = new Book(title,isbn);
    String placement = library.addBook(aBook);
    aBook.setPlacement(placement);

    /* Hinweis:
    Aufrufe k�nnen ineinander geschachtelt sein. Es ist �blich, das
    so zu machen, dient aber nicht der �bersichtlichkeit (vor allem
    nicht f�r Anf�nger). 
    */
  }
  
  /**
  Das angefragte Buch wird dem Kunden ausgeliehen.
  <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
  Fall gibt der Bibliothekar einen Hinweis aus. </p>
  @param Titel des Buchs
  @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
  */
  public Book borrow_aBookToCustomerByTitle(String title){
    // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
    // gezeigten Struktogrammden Code.
    //
    //    +-----------------------------------------------------------------+
    //    � suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      �
    //    +-----------------------------------------------------------------+
    //    � if (g�ltige Buchreferenez)                                      �
    //    �    --+----------------------------------------------------------+
    //    � then � > return Buchreferenz                                    �
    //    �    --+----------------------------------------------------------+
    //    � else � gib eine Meldung aus, dass Buchtitel nicht in Bibliothek �
    //    �      +----------------------------------------------------------+
    //    �      � > return null                                            �
    //    +------+----------------------------------------------------------+
    //
    Book aBook = library.searchBookByTitle(title);
    String placement = aBook.getPlacement();
    Book book = library.getBook(placement);

    return book;
    
    /**
    Das angefragte Buch wird dem Kunden ausgeliehen.
    <p>Ist das Buch nicht vorhanden, wird der Wert null geliefert. In diesem 
    Fall gibt der Bibliothekar einen Hinweis aus. </p>
    @param ISBN-Nummer des Buchs
    @return Referenz auf das Buch oder null, wenn es den Titel nicht gibt.
    */


    }
    public Book borrow_aBookToCustomerByISBN(String isbn){
      Book aBook = library.searchBookByISBN(isbn);
      if (aBook != null) {
        return aBook;
      } // end of if
      else{
        System.out.println("Das Buch mit der ISBN-Numemr'"+isbn+"' ist nicht verf�gbar");
        return null;
      }
    }
    
    
    /**
    Das gelieferte Buch wird in die Bibliothek zur�ckgestellt.
    @param Referenz auf das Buch
    */
    public void getABookFromCustomer(Book aBook){
      library.putBook(aBook);
    }
    
    /**
    Erinnert den Kunden, dass eine Ausleihe noch offen ist.
    @param Referenz des Kunden, der gemahnt wird
    */
    public void remindCustomer(Customer theCustomer){
      // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
      // Der Text "Kunde 'name' wird gemahnt, das Buch 'Titel' zur�ckzubringen" wird ausgegeben
      String customerName = theCustomer.getName();
      String titleOfBorrowedBook =  theCustomer.getTitleOfBorrowedBook();
      theCustomer.remind();
      System.out.println();
      
    } 
    
    
    /**
    Entfernt ein Buch aus der Bibliothek. 
    Das Buch wird anhand seiner Referenz identifiziert.
    @param Referenz des Buchs
    */
    public void removeBook(String title){
      // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
      // gezeigten Struktogrammden Code.
      //
      //    +-----------------------------------------------------------------+
      //    � suche Buchtitel in Bibliothek  ( --> liefert die Referenz)      �
      //    +-----------------------------------------------------------------+
      //    � if (g�ltige Buchreferenz)                                       �
      //    �    --+----------------------------------------------------------+
      //    � then � entferen Buch aus der Bibliothek                         �
      //    +------+----------------------------------------------------------+
      //
      //....do it
      Book aBook = library.searchBookByTitle(title);
      library.removeBook(aBook);
    }
  }