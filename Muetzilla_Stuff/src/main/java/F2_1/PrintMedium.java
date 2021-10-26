package F2_1;

public abstract class PrintMedium {
    protected String titel;
    protected String verlag;

    public PrintMedium(String titel, String verlag) {
        this.titel = titel;
        this.verlag = verlag;
    }

    public String getTitel() {
        return titel;
    }

    public String getVerlag() {
        return verlag;
    }
}
