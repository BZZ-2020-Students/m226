public class Auto {
    private String farbe;
    private int ps;


    // Konstruktor 1
    public Auto(){
        this("Blau", 100);
        // this ist dafür um den Konstruktor aufzurufen der parameter anzahl umgehen kann
    }

    // Konstruktor 2
    public Auto(String farbe){
        this(farbe, 200); //  nur 1 Wert wird übergeben der zweite wert ist vorbestimmt (200)

    }

    // Konstruktor 3
    public Auto(String farbe, int ps){
        setAuto(farbe, ps); // Methode
    }

    // Methode 1
    public void setAuto(String farbe, int ps){
        setFarbe(farbe);
        setPs(ps);
    }

    // Methode 2
    public void setFarbe(String Farbe){
        this.farbe = farbe; //  mit this wird die gloable variable gelichgesetz mit der farbe die als parameter über geben wurde
    }

    // Methode 3
    public void setPs(int ps){
        this.ps = ps;
    }
}
/*
*/