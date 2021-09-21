/**
 * Beispiel der Instanzierung von Klassen mit einer zweiseitgen
 * Beziehung.
 * (Objekt A kennt Objekt B und umgekehrt
 *
 * @Author: Alyssa Heimlicher
 * @Date: aktuelles Bearbeitungsdatum eintragen
 * @Version: beginnend mit V1.0 die Versionierung nachführen
 */
public class App2 {

    public static void main(String[] args) {

        // Auftrag 4a
        // ----------
        // Deklaration der 4 Objekte für Auto, Fahrer (2 Mal) und Besitzer
        //....do it
        Auto auto;
        AutoBesitzer besitzer;
        Fahrer moritz;
        Fahrer max;


        // Auftrag 4b
        // ----------
        // gemäss Sequenzdiagramm die Instanzierung implementieren für
        // Auto und Autobesitzer.
        // ...do it

        auto = new Auto();
        besitzer = new AutoBesitzer(auto);
        System.out.println("Nr Schild: " + besitzer.meinAuto.getNrSchild());


        // Auftrag 4c
        // ----------
        // beim ersten Fahrer (max) wird die eigene Referenz dem Auto-Objekt
        // innerhalb des Konstruktors übergeben
        // --> siehe dazu Aufruf im Konstruktor der Klasse Fahrer
        //....do it

        max = new Fahrer(auto, "Max");
        System.out.println("Max name: " + max.getName());

        // Auftrag 4d
        // ----------
        // beim zweiten Fahrer (moritz) wird nur der Name dem Konstruktor
        // mitgegeben.
        // Danach muss über die set-Merthode der Name explizit gesetzt werden.
        //....do it
        moritz = new Fahrer(auto);
        moritz.setName("Moritz");
        auto.setFahrerRef(moritz);
        System.out.println("Moritz name: " + moritz.getName());

        // Und nun muss dem Auto-Objekt noch die Referenz von Moritz übergeben
        // werden.

    }

}