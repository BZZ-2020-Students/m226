package D3_1;

public class HausBesitzer {
    private Haus meinHaus;

    public HausBesitzer(Haus meinHaus) {
        this.meinHaus = meinHaus;
        System.out.println(meinHaus.getType());
    }
}
