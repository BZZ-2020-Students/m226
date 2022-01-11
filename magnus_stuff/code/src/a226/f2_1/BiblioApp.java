package a226.f2_1;

public class BiblioApp {
    public BiblioApp() {
    }

    public static void main(String[] args) {
        new BiblioApp().run();
    }

    public void run() {
        //Autoren
        AutorListe autorliste = new AutorListe();
        Autor jan = new Autor("Jan Flemming");
        Autor dan = new Autor("Dan Brown");
        Autor max = new Autor("Max Frisch");
        autorliste.addAutor(jan);
        autorliste.addAutor(dan);
        autorliste.addAutor(max);
        autorliste.printOut();
        //Bibliothek
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addMedium(new Zeitschrift("Neue Zürcher Zeitung", "NZZ", "28.10.2020"));
        bibliothek.addMedium(new Zeitschrift("ta-media", "20 Minuten", "25.10.2020"));
        bibliothek.addMedium(new Buch("Inferno Lübbe", "Spiegel", "29-100-45-DE", jan));
        bibliothek.addMedium(new Buch("Harry Potter Band 1", "Meiler", "94-500-32-UK", dan));
        bibliothek.addMedium(new Buch("Stiller Suhr kamp", "Kranich", "36-300-15-US", max));
        bibliothek.printOut();
    }
}
