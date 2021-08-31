package C1_3;

public class Schreiber {
    public static int count = 0;
    private String farbe;
    private int nr;

    public Schreiber(String farbe, int nr) {
        this.farbe = farbe;
        this.nr = nr;
        ++count;
    }

    public void print() {
        System.out.println("Nr. " + this.nr + " Farbe: " + this.farbe);
    }

    public static void main(String[] args) {
        Schreiber s1 = new Schreiber("Blau", 1);
        Schreiber s2 = new Schreiber("Rot", 2);
        Schreiber s3 = new Schreiber("Grün", 3);
        Schreiber s4 = new Schreiber("Weiss", 4);
        Schreiber s5 = new Schreiber("Schwarz", 5);
        s1.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();
        System.out.println("Total Instanzen : " + count);
    }
}
