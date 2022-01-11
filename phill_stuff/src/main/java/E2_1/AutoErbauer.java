package E2_1;

public class AutoErbauer {
    public static void main(String[] args) {
        Auto bmw = new Auto();

        Rad rad = new Rad();
        rad.setGroesse(17);
        rad.setTyp("BBS Super RS");

        bmw.addRad(rad, 0);

        Rad rad2 = new Rad();
        rad.setGroesse(17);
        rad.setTyp("BBS Super RS");

        bmw.addRad(rad2, 1);

        Rad rad3 = new Rad();
        rad.setGroesse(17);
        rad.setTyp("BBS Super RS");

        bmw.addRad(rad3, 2);

        Rad rad4 = new Rad();
        rad.setGroesse(17);
        rad.setTyp("BBS Super RS");

        bmw.addRad(rad4, 3);

        Motor motor = new Motor();

        motor.setLeistung(193);
        motor.setHubraum(3500);

        bmw.setMotor(motor);

        bmw.setNrSchild("12345");

        bmw.print();

        bmw = null;

        motor.print();
        rad.print();

    }
}
