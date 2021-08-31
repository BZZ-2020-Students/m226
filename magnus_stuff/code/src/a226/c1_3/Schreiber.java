package a226.c1_3;

public class Schreiber {
    private static int count = 0;
    private String farbe;
    private int nr;

    public Schreiber(String farbe, int nummer){
        this.farbe = farbe;
        nr = nummer;
        count++;
    }

    public void print(){
        System.out.println("Nummer = " + nr + ", Farbe = " + farbe);
    }

    public static void main(String[] args) {
        Schreiber s = new Schreiber("Rot", 1);
        Schreiber s2 = new Schreiber("Gelb", 2);
        Schreiber s3 = new Schreiber("Weiss", 3);
        Schreiber s4 = new Schreiber("Orange", 4);
        Schreiber s5 = new Schreiber("Grau", 5);

        s.print();
        s2.print();
        s3.print();
        s4.print();
        s5.print();

        System.out.println("Total Instanzen : " + Schreiber.count);

        Schreiber[] refs;
        refs = new Schreiber[5];
        refs[0] = new Schreiber("blau", 4);
        refs[1] = new Schreiber("gruen", 3);
        refs[2] = new Schreiber("rot", 2);
        refs[3] = new Schreiber("gelb", 1);
        refs[4] = new Schreiber("orange", 5);

        for (int i=0; i<5; i++) {
            refs[i].print();
        }
    }
}
