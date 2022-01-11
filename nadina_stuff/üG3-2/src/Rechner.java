public class Rechner {

    protected float result;

    public float divide(float divisor, float dividend) throws DivideException {
        if (dividend == 0)
            throw new DivideException();
        else
            return divisor / dividend;
    }
}