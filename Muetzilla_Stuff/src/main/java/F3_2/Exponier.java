package F3_2;

public class Exponier extends MathOp {
    public Exponier() {

    }

    @Override
    public void execOp(float val1, float val2) {
        if(val2 < 0) {
            throw new RuntimeException("Ungültige Operation");
        }
        result = (float) Math.pow(val1, val2);

    }
}
