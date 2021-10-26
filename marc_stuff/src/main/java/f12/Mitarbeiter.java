package f12;

public class Mitarbeiter extends Person {
    private String telNr;

    public Mitarbeiter(String name, int alter, String telNr) {
        super(name, alter);
        this.telNr = telNr;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    @Override
    public void print() {
        System.out.println("Mitarbeiter{" +
                ", telNr='" + telNr + '\'' +
                ", name='" + name + '\'' +
                ", alter=" + alter +
                ", adresse='" + adresse + '\'' +
                '}');
    }
}
