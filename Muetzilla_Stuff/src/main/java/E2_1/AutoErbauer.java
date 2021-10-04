package E2_1;

public class AutoErbauer {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Rad rad = new Rad();
        rad.setGroesse(15);
        rad.setTyp("tubless");
        auto.addRad(rad,0);
        Motor motor = new Motor();
        motor.setLeistung(150);
        motor.setHubraum(2.4f);
        auto.setMotor(motor);
        auto.setNrString("ZH 1 000 000");
        auto = null;
        motor.print();
        rad.print();
        auto.print();

        /**
         * Aufgabe 5:
         * Resultat:
         * Es gibt einen Fehler, da die Instanz von Auto nicht mehr existiert.
         */


    }
}
