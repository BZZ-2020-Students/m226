package E2_1;

public class Motor {
    private int leistung;
    private float hubraum;

    public Motor(){

    }
    public int getLeistung(){
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    public float getHubraum() {
        return hubraum;
    }
    public void setHubraum(float hubraum){
        this.hubraum = hubraum;
    }
    public void print(){
        System.out.println("Motor: " + hubraum + "Liter / "  + leistung + " PS");
    }
}
