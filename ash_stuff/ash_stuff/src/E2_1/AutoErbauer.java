package E2_1;

public class AutoErbauer {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Rad r = new Rad();
        Motor m = new Motor();

        r.setGroesse(15);
        r.setType("tubless");
        auto.addRad(r, 0);

        m.setLeistung(150);
        m.setHubraum(2.4f);
        auto.setMotor(m);
        auto.setNrSchild("ZH 1 000 000");

        m.print();
        r.print();
        auto.print();
    }
}
