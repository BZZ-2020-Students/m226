package learningUnitF.F2_1;

abstract class PrintMedium {
    protected final String titel;
    protected final String verlag;

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
