/**
 @Author:   Nadina Amsler (shirin197)
 @Date:     29.10.2021
 @Version:  1
 */

public class Person {
    private String name;
    private int alter;
    private String adresse;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;

    }
    public void setName(String name) {
        this.name = name;
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

    public void print(){
        System.out.println("Person: " + getName() + ", Alter: " + getAlter());
    }

}
