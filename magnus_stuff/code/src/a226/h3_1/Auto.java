package a226.h3_1;

public final class Auto implements Comparable<Auto>  {
    private String marke;
    private String kennzeichen;

    public Auto(String marke, String kennzeichen) {
        this.marke = marke;
        this.kennzeichen = kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    @Override
    public String toString() {
        
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", kennzeichen='" + kennzeichen + '\'' +
                '}';
    }

    @Override
    public boolean compareTo(Auto object) {
        int thisVal = Integer.parseInt(this.kennzeichen);
        int anotherVal = Integer.parseInt(object.getKennzeichen());

        return (thisVal < anotherVal ? false : true);
    }
}
