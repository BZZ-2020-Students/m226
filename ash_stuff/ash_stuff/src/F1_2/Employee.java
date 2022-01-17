package F1_2;

public class Employee extends Person{
    private int persNr;
    private float wage;
    private String telNr;

    public Employee(String name, int age, int nr, float wage, String telNr) {
        super(name, age);
        nr = persNr;
        this.wage = wage;
        this.telNr = telNr;
    }

    public int getPersNr() {
        return persNr;
    }

    public void setPersNr(int persNr) {
        this.persNr = persNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTelNr() {
        return telNr;
    }

    public void setTelNr(String telNr) {
        this.telNr = telNr;
    }

    public void print() {
        System.out.println("Employee{" +
                "persNr = " + persNr +
                ", wage = " + wage +
                ", telNr = '" + telNr + '\'' +
                '}');
    }
}
