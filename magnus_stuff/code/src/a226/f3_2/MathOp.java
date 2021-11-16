package a226.f3_2;

public abstract class MathOp {
    protected float result;

    public MathOp() {
    }

    public abstract void execOp(float val1, float val2);

    public float getResult() {
        return result;
    }

    public void printResult() {
        System.out.println("Resultat : " + this.result);
    }
}
