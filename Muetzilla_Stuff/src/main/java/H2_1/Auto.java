package H2_1;

public class Auto implements Comparable<Auto> {
    private String marke;
    private String kennzeichen;

    public Auto(String marke, String kennzeichen) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getMarke() {
        return marke;
    }

    @Override
    public String toString() {
        return "Auto: Kennzeichen: " + kennzeichen + " Marke: " + marke;
    }

    @Override
    public int compareTo(Auto other) {
        int lengthOther = other.getKennzeichen().length();
        int lengthOwn = getKennzeichen().length();
        int shorter = Math.min(lengthOther, lengthOwn);
        for (int i = 0; i < shorter; i++) {
            char otherChar = other.getKennzeichen().charAt(i);
            char ownChar = getKennzeichen().charAt(i);
            if (otherChar > ownChar) {
                return -1;
            } else if (ownChar > otherChar) {
                return 1;
            }
        }
        return 0;
    }
}
