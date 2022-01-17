package F1_2;

public class Person {
    private String name;
    private int alter;
    private String adresse;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
    }
}
