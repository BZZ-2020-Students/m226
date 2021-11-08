package Frage4;

public class SchuelApp {

    protected static Fach f;
    protected static Schueler schueler;
    protected static Zeugnis z;

    public static void main(String[] args) {
        Schueler s = new Schueler("Muster","Max");

        z = new Zeugnis(s);

        System.out.println(z.getSchuelerName());

    }
}
