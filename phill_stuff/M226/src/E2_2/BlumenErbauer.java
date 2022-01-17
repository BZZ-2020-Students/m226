package E2_2;

public class BlumenErbauer {
    public static void main(String[] args) {
        Blume blume = new Blume();
        blume.setName("Elia");

        blume.print();

        blume = null;

        blume.print();
    }
}
