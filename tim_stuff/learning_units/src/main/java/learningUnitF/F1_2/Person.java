package learningUnitF.F1_2;

public class Person {
    private String name;
    private int alter;
    private String adresse;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String printReturn() {
        return "Name: " + getName() + "\n" +
                "Alter: " + getAlter();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
