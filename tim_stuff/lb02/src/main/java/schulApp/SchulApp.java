package schulApp;

public class SchulApp {
    private static Fach f;
    private static Schueler s;
    private static Zeugnis z;

    public static void main(String[] args) {
        s = new Schueler("Muster", "Max");
        z = new Zeugnis(s);
        System.out.println(z.getSchuelerName()+"\n");

        f = new Fach("Mathe");
        z.addFach(f);

        f = new Fach("Deutsch");
        z.addFach(f);

        for (int i = 0; i < 2; i++) {
            System.out.println("Fach: " + z.getFachName(i));
        }
    }
}