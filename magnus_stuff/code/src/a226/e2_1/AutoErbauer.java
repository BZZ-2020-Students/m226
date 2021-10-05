package a226.e2_1;
public class AutoErbauer {
    public static void main(String[] args) {
        Auto auto = new Auto();
        Rad r = new Rad();
        r.setGroesse(20);
        r.setTyp("Rain");
        auto.addRad(r, 0);

        Motor m = new Motor();
        m.setLeistung(640);
        m.setHubraum(2500);

        auto.setMotor(m);
        auto.setNrSchild("ZH - 2004");
        auto.print();
        auto = null;
        m.print();
        r.print();
        auto.print();
    }
}
