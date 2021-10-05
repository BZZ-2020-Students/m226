public class AutoErbauer {
    public static void main(String[] args) {

        Auto auto1 = new Auto();

        Rad r = new Rad();
        r.setGroesse(18);
        r.setTyp("AEZ Straight");
        auto1.addRad(r, 0);

        Motor m = new Motor();
        m.setLeistung(320);
        m.setHubraum(2);

        auto1.setMotor(m);
        auto1.setNrSchild("1 000 000");
        auto1.print();
        auto1 = null;
        m.print();
        r.print();
        auto1.print();

    }
}
