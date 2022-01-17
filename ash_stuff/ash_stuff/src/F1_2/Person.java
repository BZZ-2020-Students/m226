package F1_2;

public class Person {

    protected String name;
    protected int age;
    protected String adresse;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void print(){

        System.out.println("Person{" +
                "name = '" + name + '\'' +
                ", age = " + age +
                ", adresse = '" + adresse + '\'' +
                '}');
    }
}
