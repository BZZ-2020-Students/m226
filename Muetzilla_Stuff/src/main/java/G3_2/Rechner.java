package G3_2;

/**
 * Beschreibung
 *
 * @author
 * @version 1.0 vom 04.12.2014
 */

public class Rechner {

    // Anfang Attribute
    protected float result;
    // Ende Attribute

    // Anfang Methoden
    public float divide(float divisor, float dividend) throws DivideException {
        if (dividend == 0)
            throw new DivideException();
        else
            return divisor / dividend;
    }

    // Ende Methoden
} // end of Rechner
