package learningUnitF.F2_1;

public class Autorliste {
    public final int MAX_AUTOREN = 5;
    private int autorenCntr = 0;
    private Autor[] autoren = new Autor[MAX_AUTOREN];

    public Autorliste() {
    }

    public void addAutor(Autor autor) {
        autoren[autorenCntr++] = autor;
    }

    public Autor getAutor(int index) {
        return autoren[index];
    }

    public void printOut() {
        System.out.println("Autoren:");
        System.out.println(" Vorhandene Autoren: " + autorenCntr + " {");
        for (int i = 0; i < autorenCntr; i++) {
            System.out.println("\t " + (i + 1) + ": " + autoren[i].getName());
        }

        System.out.println("}");
    }
}
