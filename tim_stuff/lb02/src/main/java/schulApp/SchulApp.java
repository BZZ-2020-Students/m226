package schulApp;

public class SchulApp {
    private static Fach f;
    private static Schueler s;
    private static Zeugnis z;

    public static void main(String[] args) {
        s = new Schueler("Muster", "Max");
        z = new Zeugnis(s);

        f = new Fach("Mathe");
        z.addFach(f);

        f = new Fach("Deutsch");
        z.addFach(f);

        Fach fach = z.getFach(0);
        fach.addNote(5.0f);
        fach.addNote(3.5f);

        System.out.println(z.printZeugnis());
    }
}