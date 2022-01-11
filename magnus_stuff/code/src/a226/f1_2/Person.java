package a226.f1_2;

public class Person {
    protected String name;
    protected int alter;
    protected String adresse;

    public Person(String name, int alter){
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
        System.out.println("name= " + name +
                " alter= " + alter +
                " adresse= " + adresse);


    }
}
