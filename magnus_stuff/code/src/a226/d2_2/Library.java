package a226.d2_2;

import java.util.Date;
import java.util.Enumeration;
import java.util.Random;
import java.util.Vector;

public class Library {
    private Vector<Book> library = new Vector();
    private Random rand = new Random((new Date()).getTime());

    public Library() {
    }

    public String addBook(Book aBook) {
        this.library.add(aBook);
        return this.getFreePlacement();
    }

    public void removeBook(String placement) {
        this.removeBook(this.searchBookByPlacement(placement));
    }

    public void removeBook(Book aBook) {
        this.library.remove(aBook);
    }

    public Book searchBookByTitle(String title) {
        for(int i = 0; i < this.library.size(); ++i) {
            if (((Book)this.library.get(i)).getTitle().equals(title)) {
                return (Book)this.library.get(i);
            }
        }

        return null;
    }

    public Book searchBookByISBN(String isbn) {
        for(int i = 0; i < this.library.size(); ++i) {
            if (((Book)this.library.get(i)).getISBN().equals(isbn)) {
                return (Book)this.library.get(i);
            }
        }

        return null;
    }

    private Book searchBookByPlacement(String placement) {
        for(int i = 0; i < this.library.size(); ++i) {
            if (((Book)this.library.get(i)).getPlacement().equals(placement)) {
                return (Book)this.library.get(i);
            }
        }

        return null;
    }

    public Book getBook(String _placement) {
        Book b = this.searchBookByPlacement(_placement);
        this.library.remove(b);
        return b;
    }

    public Book getBook(Book aBook) {
        this.library.remove(aBook);
        return aBook;
    }

    public void putBook(Book aBook) {
        this.library.add(aBook);
    }

    public void printInventory() {
        Enumeration e = this.library.elements();

        while(e.hasMoreElements()) {
            Book b = (Book)e.nextElement();
            System.out.println("-------------------------------------");
            System.out.println("Buch:    " + b.getTitle());
            System.out.println("ISBN:    " + b.getISBN());
            System.out.println("Ablage:  " + b.getPlacement());
        }

    }

    private String getFreePlacement() {
        String placement = "";
        placement = placement + (char)(this.rand.nextInt(25) + 65);
        placement = placement + (this.rand.nextInt(30) + 10);
        return placement;
    }

    public static void main(String[] args) {
        Library b = new Library();
        System.out.println("Errichte Bibliothek");
        Book x = new Book("Ein Titel", "123-456");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein Titel", "123-456");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein neuer Titel", "3-223-452-898");
        x.setPlacement(b.addBook(x));
        x = new Book("Ein Buch", "x67-3-445-6-22");
        x.setPlacement(b.addBook(x));
        b.printInventory();
        System.out.println("\nSuche Buch mit Titel 'Ein Titel'");
        x = b.searchBookByTitle("Ein Titel");
        if (x != null) {
            x.print();
        }

        System.out.println("\nSuche Buch mit Titel 'falscher Titel'");
        x = b.searchBookByTitle("falscher Titel");
        if (x != null) {
            x.print();
        } else {
            System.out.println("Buch 'falscher Titel' existiert nciht");
        }

        System.out.println("\nDas Buch 'Ein Buch' ausleihen (= aus Bibliothek nehmen)");
        x = b.searchBookByTitle("Ein Buch");
        b.getBook(x.getPlacement());
        b.printInventory();
        System.out.println("\nBuch zurückgeben");
        b.putBook(x);
        b.printInventory();
        System.out.println("\nBuch 'Ein Titel' aus der Bibliothek löschen");
        b.removeBook(b.searchBookByTitle("Ein Titel").getPlacement());
        b.printInventory();
    }
}
