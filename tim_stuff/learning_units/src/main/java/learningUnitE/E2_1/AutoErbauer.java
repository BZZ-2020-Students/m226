package learningUnitE.E2_1;

public class AutoErbauer {
    public static void main(String[] args) {
        Auto auto =  new Auto();

        Rad rad = new Rad();
        rad.setGroesse(21);
        rad.setTyp("RAD");

        auto.addRad(rad, 0);

        Motor motor = new Motor();
        motor.setLeistung(666);
        motor.setHubraum(69.420f);

        auto.setMotor(motor);
        auto.setNrSchild("ZH 1010101010");

        auto.print();

        rad.print();
        motor.print();
    }
}
