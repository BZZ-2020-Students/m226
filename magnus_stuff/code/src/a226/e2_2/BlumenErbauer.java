package a226.e2_2;

public class BlumenErbauer {
    public static void main(String[] args) {
        Blume blume = new Blume();
        blume.setName("Rose");
        blume.print();

        blume = null;
        blume.print();
    }
}
