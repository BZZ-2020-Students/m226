package a226.f2_1;

public class AutorListe {
    public int MAX_AUTOREN;
    private Autor[] autoren = new Autor[5];
    private int autorenCntr;

    public AutorListe() {
    }

    public void addAutor(Autor autor) {
        this.autoren[this.autorenCntr] = autor;
        ++this.autorenCntr;
    }

    public Autor getAutor(int index) {
        return this.autoren[index];
    }

    public void printOut() {
        System.out.println("Autoren-Liste\n-------------");

        for(int i = 0; i < this.autorenCntr; ++i) {
            System.out.println(this.autoren[i].getName());
        }

    }
}
