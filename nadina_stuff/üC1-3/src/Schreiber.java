public class Schreiber {

    // public
    // auf Übungsblatt Unterstrichen
    public static int count = 0;
    // private
    private String farbe;
    private int nr;

    public Schreiber(String farbe, int nummer){
        this.farbe = farbe;
        this.nr = nummer;
        count++;
    }


    // print Method
    public void print(){
        System.out.println("Farbe : " + farbe);
        System.out.println("Nummer : " + nr);

    }

    // main -Method
    public static void main(String[] args) {
        Schreiber schr1 = new Schreiber( "Gelb", 1);
        Schreiber schr2 = new Schreiber( "Grün", 2);
        Schreiber schr3 = new Schreiber( "Schwarz", 3);
        Schreiber schr4 = new Schreiber( "Pink",4);
        Schreiber schr5 = new Schreiber( "Blau", 5 );

        schr1.print();
        schr2.print();
        schr3.print();
        schr4.print();
        schr5.print();

        System.out.println("Total Instanzen : " + Schreiber.count);
    }
}
