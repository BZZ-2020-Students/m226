package F2_1;

public class BiblioApp {
    public static void main(String[] args) {
        AutorListe autorListe = new AutorListe();
        //
        autorListe.addAutor(new Autor("Stephen Hawking"));
        autorListe.addAutor(new Autor("Walter Meier"));
        autorListe.addAutor(new Autor("Jürgen Strin"));
        //
        autorListe.printOut();
        //
        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addMedium(new Zeitschrift("Tagi", "Tagi-Verlag", "26.10.2021"));
        bibliothek.addMedium(new Zeitschrift("NZZ", "NZZ", "26.10.2021"));
        //
        bibliothek.addMedium(new Buch("Eine kurze Geschichte der Zeit", "rororo", "1234567890", autorListe.getAutor(0)));
        bibliothek.addMedium(new Buch("Ein Tag im Weltraum", "Space-Verlag", "0987654321", autorListe.getAutor(1)));
        bibliothek.addMedium(new Buch("Der Mond und ich", "Moon-Verlag", "6789054321", autorListe.getAutor(2)));
        //
        // bibliothek.printOut();
        bibliothek.showInventory();
    }
}
