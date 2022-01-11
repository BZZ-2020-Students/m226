package a226.f2_1;

public class Buch extends PrintMedium{
    private String isbnNr;
    private Autor autor;

    public Buch(String titel, String verlag, String isbnNr, Autor autor) {
        super(titel, verlag);
        this.isbnNr = isbnNr;
        this.autor = autor;
    }

    public String getIsbnNr() {
        return this.isbnNr;
    }

    public Autor getAutor() {
        return this.autor;
    }

    @Override
    public void showinfo() {
        addTabulator2Text("ISBN-Nummer: "+isbnNr);
        addTabulator2Text("Autor: " + autor);
    }
}
