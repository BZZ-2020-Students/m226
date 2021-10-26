package f21;

import java.util.Date;

public class BiblioApp {
    public static void main(String[] args) {
        AutorListe autoren = new AutorListe();
        autoren.addAutor(new Autor("Ian Flemming"));
        autoren.addAutor(new Autor("Dan Brown"));
        autoren.addAutor(new Autor("Max Frisch"));

        autoren.printOut();

        String dateString = "15.12.2004";
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addMedium(new Zeitschrift("NZZ", "Neue Zuercher Zeitung", dateString));
        bibliothek.addMedium(new Zeitschrift("20 Minuten", "ta-media", dateString));
        bibliothek.addMedium(new Buch("Inferno", "Luebbe", "asdpfihovguhp", autoren.getAuthor(1)));
        bibliothek.addMedium(new Buch("Dr. No", "Springer", "opadfhiivuzg0", autoren.getAuthor(0)));
        bibliothek.addMedium(new Buch("Illuminati", "Springer", "snUretnUdniSnetanimullI", autoren.getAuthor(1)));

        bibliothek.showInventory();
    }
}
