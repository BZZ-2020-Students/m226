package Frage6;

public class SchuelApp {

    protected static Fach f;
    protected static Schueler schueler;
    protected static Zeugnis z;

    public static void main(String[] args) {
        Schueler s = new Schueler("Muster","Max");

        z = new Zeugnis(s);

        System.out.println(z.getSchuelerName());

//        Frage 5
        f = new Fach("Mathe");
        z.addFach(f);

        f = new Fach("Deutsch");
        z.addFach(f);

        for (int i = 0; i < 2; i++) {
            System.out.println(z.getFachName(i));
        }

//        Frage 6
        f = z.getFach(0);

        f.addNote(5.0f);
        f.addNote(3.5f);

        z.printZeugnis();
    }
}
