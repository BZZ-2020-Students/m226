package uebungschulklasse;

public class Schule {
    public static void main(String[] args) {
        Klasse dieKlasse = new Klasse("Klasse 1A");
        Lehrperson lempel = new Lehrperson("Lempel", "Johann");
        dieKlasse.setLehrperson(lempel);
        String[] vNameLerndende = {"Bea", "Musti", "Bela", "Kurt", "Peter"};
        String[] nNameLerndende = {"Meier", "Ötzürk", "Gavranovic", "Schneider", "Brönnimann"};
        int[] gebJahrLerndende = {2002, 2001, 2002, 2003, 2002};
        for (int i = 0; i < 5; i++) {
            Lernende l = new Lernende(nNameLerndende[i], vNameLerndende[i], gebJahrLerndende[i]);
            dieKlasse.addLernende(l);
        }
        System.out.println("Infos zur Klasse" + dieKlasse.getKlassenname());
        System.out.println("\tLehrperson: " + dieKlasse.getLehrperson().getName());
        System.out.println("\tLernende:");
        for (int i = 0; i < dieKlasse.getAnzahlLernende(); i++) {
            System.out.println("\t\t" + dieKlasse.getNameLernende(i) + ", " + dieKlasse.getLerndendeGeburtsJahr(i));
        }
    }
}
