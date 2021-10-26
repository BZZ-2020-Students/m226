package learningUnitF.F2_1;

public class BiblioApp {
    public static void main(String[] args) {
        Autorliste autorliste = new Autorliste();
        autorliste.addAutor(new Autor("Tim Irmler"));
        autorliste.addAutor(new Autor("Phillip Jerebic"));
        autorliste.addAutor(new Autor("Alyssa Heimlicher"));
        autorliste.printOut();

        Bibliothek bibliothek = new Bibliothek();
        bibliothek.addMedium(new Zeitschrift("News gestern", "langsame news", "gestern"));
        bibliothek.addMedium(new Zeitschrift("News morgen", "zukunfts news", "morgen"));

        bibliothek.addMedium(new Buch("buch von autor1", "verlag autor1", "isbn1", autorliste.getAutor(0)));
        bibliothek.addMedium(new Buch("buch von autor2", "verlag autor2", "isbn2", autorliste.getAutor(1)));
        bibliothek.addMedium(new Buch("buch von autor3", "verlag autor3", "isbn3", autorliste.getAutor(2)));
        bibliothek.printOut();
    }
}
