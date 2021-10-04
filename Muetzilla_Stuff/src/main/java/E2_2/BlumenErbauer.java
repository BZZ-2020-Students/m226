package E2_2;

public class BlumenErbauer {
    public static void main(String[] args) {
        Blume blume = new Blume();
        blume.setName("Wunderblume");
        blume.print();
        blume  =null;
        blume.print();

        /**
         * Aufgabe 5
         *
         * Es gibt einen Fehler, da die Blume nach beim letzten print nicht mehr existiert, da sie auf "null" gesetzt wurde.
         */
    }
}
