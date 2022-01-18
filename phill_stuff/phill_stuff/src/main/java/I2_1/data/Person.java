package I2_1.data;


public class Person implements Comparable<Person> {

    private String name, prename;
    private String hobby;


    public Person(String name, String prename, String hobby) {
        this.name = name;
        this.prename = prename;
        this.hobby = hobby;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getPrename() {
        return prename;
    }


    public void setPrename(String prename) {
        this.prename = prename;
    }


    public String getHobby() {
        return hobby;
    }


    public void setHobby(String hobby) {
        this.hobby = hobby;
    }


    @Override
    public int compareTo(Person p) {
        return name.compareTo(p.getName());
    }
}
