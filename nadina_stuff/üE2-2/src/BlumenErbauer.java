public class BlumenErbauer {
    public static void main(String[] args) {

        Blume blume = new Blume();
        blume.setName("Lilie");
        blume.print();
        blume = null;
        blume.print();

    }
}
