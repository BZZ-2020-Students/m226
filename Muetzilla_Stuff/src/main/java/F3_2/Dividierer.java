package F3_2;

public class Dividierer extends MathOp {
    public Dividierer() {

    }

    @Override
    public void execOp(float val1, float val2) {
        if (val2 != 0) {
            result = val1 / val2;
        } else {
            throw new RuntimeException("Division durch 0 ist nicht erlaubt");
        }
    }
}
