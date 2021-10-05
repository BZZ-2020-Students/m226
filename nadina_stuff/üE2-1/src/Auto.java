public class Auto {

    private String nrSchild;
    private Rad[] raeder = new Rad[2];
    private Motor motor;



    Auto(){

    }

    public String getNrSchild() {
        return nrSchild;
    }

    public void setNrSchild(String nrSchild) {
        this.nrSchild = nrSchild;
    }

    public Rad getRad(int index) {
        return raeder[index];
    }

    public void addRad(Rad r, int position){
        this.raeder[position] = r;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void print(){
        System.out.println("Auto ZH " + nrSchild + " mit");
        System.out.println("- " + motor.getHubraum() + " Liter");
        System.out.println("- " + motor.getLeistung() + " PS");
        System.out.println("- Bereifung " + raeder[0].getGroesse() + " Zoll, " + raeder[0].getTyp());
    }
}
