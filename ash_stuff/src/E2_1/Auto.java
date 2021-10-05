package E2_1;

public class Auto {
    private String nrSchild;
    private Rad[] raeder = new Rad[4];
    private Motor motor;

    public Auto() {
    }

    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Rad getRad(int index) {
        return raeder[index];
    }

    public void addRad(Rad rad, int position) {
        raeder[position] = rad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void print(){
        System.out.println("Auto " + nrSchild + " mit \n" +
                "- " + motor.getHubraum() + " Liter\n" +
                "- " + motor.getLeistung() + "PS\n" +
                "- Bereifung " + raeder[0].getGroesse() + " Zoll, " + raeder[0].getType());
    }
}
