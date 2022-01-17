public class Auto  implements Comparable<Auto>{
    private String marke;
    private String kennzeichen;
    private String farbe;

    public Auto(String marke, String kennzeichen, String farbe){
        this.marke = marke;
        this.kennzeichen = kennzeichen;
        this.farbe = farbe;
    }


    public String getMarke() {
        return marke;
    }

    public String getKennzeichen() {
        return (kennzeichen +  " - " + marke + " " + farbe);
    }

    public String getFarbe(){
        return farbe;
    }

    @Override
    public int compareTo(Auto other) {
        return kennzeichen.compareTo(other.getKennzeichen());
    }

    @Override
    public String toString() {
        return marke + "| "  + kennzeichen + "| " + farbe;
    }
}
