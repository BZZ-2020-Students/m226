package learnJunit;

public class Main {
    public int add(int x, int y) {
        return x + y;
    }

    public int[] getArray() {
        return new int[]{1, 23, 4};
    }

    public int durch(int x, int y) throws Exceptiondurchzero {
        if (y == 0) {
            throw new Exceptiondurchzero();
        }
        return x / y;
    }
}
