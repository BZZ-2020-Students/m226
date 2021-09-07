package D2_2;

public class Book {
    private String title;
    private String isbn;
    private String placement;

    public Book(String _title, String _isbn) {
        this.title = _title;
        this.isbn = _isbn;
    }

    public void setPlacement(String _placement) {
        this.placement = _placement;
    }

    
    public String getTitle() {
        return this.title;
    }

    public String getISBN() {
        return this.isbn;
    }

    public String getPlacement() {
        return this.placement;
    }

    public void print() {
        System.out.println("Buchtitel: " + this.title + " / ISBN: " + this.isbn + " / Ablageort : " + this.placement);
    }
}
