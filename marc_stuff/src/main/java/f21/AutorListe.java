package f21;

public class AutorListe {
    public static final int MAX_AUTOREN = 5;
    private final Autor[] autoren;
    private int autorenCounter = 0;

    public AutorListe() {
        autoren = new Autor[MAX_AUTOREN];
    }

    public void addAutor(Autor autor) {
        autoren[autorenCounter++] = autor;
    }

    public Autor getAuthor(int index) {
        return autoren[index];
    }

    public void printOut() {
        System.out.println("Autoren-Liste");
        System.out.println("-".repeat(13));
        for (Autor autor : autoren) {
            if (autor == null) continue;
            System.out.println(autor.getName());
        }
        System.out.println();
    }
}
