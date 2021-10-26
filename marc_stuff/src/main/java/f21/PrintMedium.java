package f21;

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

    public static String addTab2Text(String s) {
        StringBuilder sBuilder = new StringBuilder(s);
        while (sBuilder.length() < 30) {
            sBuilder.append(" ");
        }

        s = sBuilder.toString();

//        System.out.println(s.length());

        return s;
    }
}
