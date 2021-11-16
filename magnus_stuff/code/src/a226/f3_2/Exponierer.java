package a226.f3_2;/*
 * Created on 14.09.2006
 *
 * TODO To change the template for this generated file go to
 * Window - Preferences - Java - Code Style - Code Templates
 */


/**
 * Mathematikfunktion: Multiplizierer<br>
 * Exponiert zwei Zahlen und liefert auf Anfrage das Resultat.
 * <p>Diese Klasse erweitert die abstrakte Grundklasse MathOp.
 * Hier wird die Methode execOp konkretisiert.<br>
 * Die Klasse benutzt das Attribut "result" der Oberklasse
 * für die Ergebnissicherung.<br>
 * Alle weitere Funktionalität ist durch die Oberklasse
 * bereitgestellt und muss hier nicht mehr implementiert
 * werden.<p>
 */
public class Exponierer extends MathOp {

    /**
     * Erzeugt den Multiplizierer und initalisiert die Attribute
     */
    public Exponierer() {
        super();
    }

    /**
     * Multiplikationsoperation<br>
     * Führt die Operation  value1 ^ value2 aus.
     */
    public void execOp(float value1, float value2) {
        result = value1;
        if (value2 == 0) {
            result = 1;
        } else {
            for (int z = 0; z < value2 - 1; z++) {
                result = value1 * result;
            }
        }
    }
}