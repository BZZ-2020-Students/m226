package unitTests;

public class Main {
    public static void main(String[] args) {

    }

    public int add(int num1, int num2) {
        return num1+num2;
    }

    public int[] getArray() {
        return new int[]{1,23,4};
    }

    public boolean throwException(boolean value) {
        if(value) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            return value;
        }
    }
}
