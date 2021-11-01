package f21;

public class Autor {
    private final String name;

    public Autor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "name='" + name + '\'' +
                '}';
    }
}
