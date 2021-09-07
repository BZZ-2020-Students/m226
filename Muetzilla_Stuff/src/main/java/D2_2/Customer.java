package D2_2;

/**
   Die Klasse beschreibt einen Kunden, der in der Bibliothek
   ein Buch<br>
   - ausleihen [ borrow_aBookByTitle() ] oder<br>
   - zurückgeben [ bringBackABook() ]<br>
   will.<br>
   Die Ausleihe begrenzt sich pro Kunde auf ein Buch.
   <p>Der Kunde kann gemahnt werden.</p>
   
   @Author:   bitte Namen ergänzen
   @Date:     aktuelles Bearbeitungsdatum eintragen
   @Version:  beginnend mit V1.0 die Versionierung nachführen
*/
public class Customer{
  
  private String name;
  private Book borrowedBook;
  private Librarian theLibrarian;
  
  /**
  Initialisiert ein Objekt vom Typ Kunden mit dem Namen des Kunden.
  Zudem wird die Referenz zum Bibliothekar mitgeliefert. Diese wird dann
  gespeichert.
  @param _name Name des Bibliothekar
  @param theLibrarian Referenz auf Bibliothekar
  */
  public Customer(String _name, Librarian theLibrarian){
    name = _name;
    this.theLibrarian = theLibrarian;
  }
  
  
  /** 
  Liefert den Namen des Kunden.
  @return Name
  */
  public String getName(){
    return name;
  }
  
  
  /**
  Bezieht beim Bibliothekar das Buch, dessen Titel mitgegeben wird.
  <p>Ist das Buch verfügbar, wird die Referenz abgespeichert.<br>
  Andernfalls (Referenz ist null) wird eine entsprechende Meldung ausgegeben.</p>
  @param title Titel des Buchs
  */
  public void borrow_aBookByTitle(String title){
    // Implementieren Sie entsprechend dem Sequenzdiagramm und dem
    // hier gezeigten Struktogramm den Code.
    //
    //    +-----------------------------------------------------------------+
    //    | Gib Bibliothekar den gewünschten Buchtitel                      ¦
    //    +-----------------------------------------------------------------+
    //    ¦ if (keine gültige Buchreferenez)                                ¦
    //    ¦    --+----------------------------------------------------------+
    //    ¦ then ¦ gib Meldung aus, dass Buch mit gesuchten Titel fehlt     ¦
    //    ¦    --+----------------------------------------------------------+
    //    ¦ else ¦ gib Titel und ISBN des Buchs aus, das ausgeliehen wurde  ¦
    //    +------+----------------------------------------------------------+
    //
    //....do it
    borrowedBook = theLibrarian.borrow_aBookToCustomerByTitle(title);
    if (borrowedBook == null) {
      System.out.println("Schade gibt es das Buch '"+title+"' nicht.");
    } // end of if
    else
    System.out.println(name+" leiht Buch '"+borrowedBook.getTitle() +"' aus");
  }
  
  
  /**
  Bringt dem Bibliothekar das ausgeliehene Buch zurück.
  Nach der Rückgabe des Buchs wird die Referenz auf null gesetzt.
  */
  public void bringBackABook(){
    // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
    // die lokale Referenz auf das Buch-Objekt muss "gelöscht" werden. Das...
    // ...wird mittels Zuweisung des Wertes null bewerkstelligt!
    //....do it
    theLibrarian.getABookFromCustomer(borrowedBook);
  }
  
  
  /**
  
  */
  public void remind(){
    // Implementieren Sie entsprechend dem Sequenzdiagramm den Code
    // Der Text " 'name' bringt Buch 'Titel' zurück" wird ausgegeben
    //....do it
    System.out.println("");
    
  }
  
  
  /**
  Liefert den Titel des Buchs, das durch den Kunden ausgeliehen wurde.
  @return Buchtitel
  */
  public String getTitleOfBorrowedBook(){
    // Implementieren Sie entsprechend dem Sequenzdiagramm
    //....do it
    return "";
  }
}