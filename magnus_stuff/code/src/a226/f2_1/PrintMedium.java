package a226.f2_1;

public abstract class PrintMedium {
    String titel;
    String verlag;

    public PrintMedium(String titel, String verlag) {
        this.titel = titel;
        this.verlag = verlag;
    }

    public String getTitel() {
        return this.titel;
    }

    public String getVerlag() {
        return this.verlag;
    }

    public abstract void showinfo();

    protected String addTabulator2Text(String text) {
        while(text.length() < 20) {
            text = text + " ";
        }

        return text;
    }
}
