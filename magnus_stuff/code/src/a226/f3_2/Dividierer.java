package a226.f3_2;

public class Dividierer extends MathOp {
    public Dividierer() {
    }

    public void execOp(float value1, float value2) {
        if (value2 > 0) {
            this.result = value1 / value2;
        }
    }
}
