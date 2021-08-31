package C1_2;

public class Counter {
    private int value;

    public Counter(int intital) {
        this.value = intital;
    }

    public void printValue() {
        System.out.println("Value: " + this.value);
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void incValue(int value) {
        System.out.println("Methode incValue wird ausgeführt");
        System.out.println("\tParameterwert alt ist " + value);
        ++value;
        System.out.println("\tParameterwert neu ist " + value);
    }

    public static void main(String[] args) {
        Counter c = new Counter(5);
        c.printValue();
        c.incValue(3);
        c.printValue();
    }
}
