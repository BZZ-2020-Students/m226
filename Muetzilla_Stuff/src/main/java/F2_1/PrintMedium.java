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

    public abstract void showInfo();

    public static String addTab2Text(String string) {
        StringBuilder sBuilder = new StringBuilder(string);
        while (sBuilder.length() < 30) {
            sBuilder.append(" ");
        }
        string = sBuilder.toString();
        return string;
    }
}
