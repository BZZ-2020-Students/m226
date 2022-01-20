public class Calculator {
    public static void main(String[] args) {

    }

    public int addition(int x, int y) {
        if (x < 0 || y < 0) {
            return 0;
        }
        return x + y;
    }

    public int subtraction(int x, int y) {
        return x - y;
    }

    public int divide(int x, int y) throws DevideException {
        if(y == 0){
            throw new DevideException();
        }
        return x / y;
    }

    public int[] getArray() {
        return new int[]{1,23,4};
    }
}
