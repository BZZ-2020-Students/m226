package F3_1;

public class Buch extends PrintMedium {
    private String isbnNr;
    private Autor autor;

    public Buch(String titel, String verlag, String isbnNr, Autor autor) {
        super(titel, verlag);
        this.isbnNr = isbnNr;
        this.autor = autor;

    }

    public String getIsbnNr() {
        return isbnNr;
    }

    public Autor getAutor() {
        return autor;
    }
}
