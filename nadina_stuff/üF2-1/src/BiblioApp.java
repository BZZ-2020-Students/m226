public class BiblioApp {

    public static void main(String[] args) {

        // new Autor Liste
        AutorListe autorListe = new AutorListe();

        autorListe.addAutor(new Autor("Orion Carlote"));
        autorListe.addAutor(new Autor("Daniel Levitin"));
        autorListe.addAutor(new Autor("Lala Bohang"));

        autorListe.printOut();

        // new Bibliothek
        Bibliothek bibliothek = new Bibliothek();

        bibliothek.addMedium(new Zeitschrift("Daily News", "23.10.2021","DailyPost"));
        bibliothek.addMedium(new Zeitschrift("Blick", "24.10.2021","DeutscherVerlag"));

        bibliothek.addMedium(new Buch("Film for Her", "H1-222",autorListe.getAutor(0), "ZZN"));
        bibliothek.addMedium(new Buch("The Organized Mind", "93-2H2", autorListe.getAutor(1), "DeutscherVerlag"));
        bibliothek.addMedium(new Buch("The Book of forbidden feelings", "0JI-2920", autorListe.getAutor(2), "BaumhausNZZ"));

        bibliothek.showInventory();
        bibliothek.printOut();


    }
}
