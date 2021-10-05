package learningUnitE.E2_1;

public class Auto {
    private String nrSchild;
    private Rad[] raeder;
    private Motor motor;

    public Auto() {
        raeder = new Rad[4];
    }

    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Rad[] getRaeder() {
        return raeder;
    }

    public void setRaeder(Rad[] raeder) {
        this.raeder = raeder;
    }

    public void addRad(Rad rad, int position) {
        this.raeder[position] = rad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void print() {
        System.out.println("Auto " + nrSchild + " mit\n" +
                "- " + this.getMotor().getHubraum() + " Liter\n" +
                "- " + this.getMotor().getLeistung() + " PS\n" +
                "- Bereifung " + this.getRaeder()[0].getGroesse() + " Zoll, " + this.getRaeder()[0].getTyp());
    }
}
