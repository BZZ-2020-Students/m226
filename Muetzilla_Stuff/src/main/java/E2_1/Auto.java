package E2_1;

public class Auto {
    private String nrString;
    private Rad[] raeder = new Rad[4];
    private Motor motor;

    public Auto(){

    }
    public String getNrString(){
        return nrString;
    }
    public void setNrString(String nrSchild){
        this.nrString = nrSchild;
    }
    public Rad getRad(int index){
        return raeder[index];
    }
    public void addRad(Rad rad, int index){
        raeder[index] = rad;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
    public void print(){
        System.out.println("Auto " + nrString + " mit \n" +
                "- " + motor.getHubraum() + " Liter\n" +
                "- " + motor.getLeistung() + "PS\n" +
                "- Bereifung" + raeder[0].getTyp() + " / Grösse " + raeder[0].getGroesse() + " Zoll");
    }
}
