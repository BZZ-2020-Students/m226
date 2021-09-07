package learningUnitD.D2_1;

/**
 * Beschreibt einen Musiker, der ein Instrument spielt
 * und auf diesem Töne erzeugt.
 *
 * @author Tim Irmler
 * @Date: 07.09.2021
 * @Version: V1.0
 */
public class Musiker {

    private String name;
    private Instrument refToInstrument;

    public Musiker(String name, Instrument instrument) {
        this.name = name;
        refToInstrument = instrument;
    }

    public String getName() {
        return name;
    }

    /*
    Musiker spielt einen Ton
    */
    public void spielNote(char note) {
        System.out.print(this.name + " spielt mit ");
        refToInstrument.spielNote(note);
    }

}