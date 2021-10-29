public class BiblioApp {

    public static void main(String[] args) {

        // new Autor Liste
        AutorListe autorListe = new AutorListe();

        autorListe.addAutor(new Autor("Orion Carlote"));
        autorListe.addAutor(new Autor("Daniel Levitin"));
        autorListe.addAutor(new Autor("Lala Bohang"));

        autorListe.printOut();
    }
}
