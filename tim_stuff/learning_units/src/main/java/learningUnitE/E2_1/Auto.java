package learningUnitE.E2_1;

public class Auto {
    private String nrSchild;
    private Rad[] raeder;
    private Motor motor;

    public Auto() {
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

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
