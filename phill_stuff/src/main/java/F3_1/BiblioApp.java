package F3_1;

public class BiblioApp {

    public static void main(String[] args) {
        Autor a1 = new Autor("Franz");
        Autor a2 = new Autor("Fritz");
        Autor a3 = new Autor("Hans");
        AutorListe autorListe = new AutorListe();
        autorListe.addAutor(a1);
        autorListe.addAutor(a2);
        autorListe.addAutor(a3);
        autorListe.printOut();
        Bibliothek bibliothek = new Bibliothek();
        Zeitschrift zeitschrift1 = new Zeitschrift("NZZ", "Verlag1", "26.10.2021");
        Zeitschrift zeitschrift2 = new Zeitschrift("20 Minuten", "Verlag2", "26.10.2021");
        bibliothek.addMedium(zeitschrift1);
        bibliothek.addMedium(zeitschrift2);
        Buch buch1 = new Buch("Buch1", "Verlag12", "123456789-X", a1);
        Buch buch2 = new Buch("Buch2", "Verlag13", "123456788-X", a1);
        Buch buch3 = new Buch("Buch3", "Verlag14", "123456787-X", a1);
        bibliothek.addMedium(buch1);
        bibliothek.addMedium(buch2);
        bibliothek.addMedium(buch3);
        bibliothek.printOut();
    }
}
