package a226.e2_1;

public class Motor {
    private int leistung;
    private float hubraum;

    public Motor() {
    }

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public float getHubraum() {
        return hubraum;
    }

    public void setHubraum(float hubraum) {
        this.hubraum = hubraum;
    }

    public void print() {
        System.out.println("Motor: " + String.format("%.1f", hubraum) + " Liter / " + leistung + " PS");
    }
}
