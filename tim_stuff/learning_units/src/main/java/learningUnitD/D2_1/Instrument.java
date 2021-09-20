package learningUnitD.D2_1;

/**
 * Beschreibt ein Musikinstrument, das einen Ton spielen kann.
 *
 * @author Tim Irmler
 * @Date: 07.09.2021
 * @Version: V1.0
 */
public class Instrument {

    private String bezeichnung;

    public Instrument(String bez) {
        bezeichnung = bez;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    /*
    spielt den geforderten Ton
    */
    public void spielNote(char note) {
        System.out.println(" " + getBezeichnung() + " die Note " + note);
    }
}