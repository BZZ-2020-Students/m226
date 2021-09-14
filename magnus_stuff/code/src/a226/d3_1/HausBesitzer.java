package a226.d3_1;

public class HausBesitzer {
    private Haus meinHaus;
    private String type;

    public HausBesitzer(Haus meinHaus) {
        this.meinHaus = meinHaus;
        this.type = meinHaus.getHausType();
    }

    @Override
    public String toString() {
        return type;

    }
}
