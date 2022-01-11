package F3_2;

public class Subtrahierer extends MathOp {
    public Subtrahierer() {
    }

    @Override
    public void execOp(float val1, float val2) {
        result = val1 - val2;
    }
}
