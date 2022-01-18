package F3_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MyReader {
    static MyReader reader = null;
    private Scanner scanner = null;

    private MyReader() {
        this.scanner = new Scanner(System.in);
    }

    public static MyReader getInstance() {
        if (reader == null) {
            reader = new MyReader();
        }

        return reader;
    }

    public int getInt(String hinweis) {
        System.out.print("\n" + hinweis);

        try {
            return this.scanner.nextInt();
        } catch (InputMismatchException var3) {
            System.out.println("ERROR : " + var3);
            System.exit(0);
            return 0;
        }
    }

    public double getDouble(String hinweis) {
        System.out.print("\n" + hinweis);

        try {
            return this.scanner.nextDouble();
        } catch (InputMismatchException var3) {
            System.out.println("ERROR : " + var3);
            System.exit(0);
            return 0.0D;
        }
    }

    public String getString(String hinweis) {
        System.out.print("\n" + hinweis);

        try {
            return this.scanner.nextLine();
        } catch (InputMismatchException var3) {
            System.out.println("ERROR : " + var3);
            System.exit(0);
            return null;
        }
    }

    public static void main(String[] args) throws InputMismatchException {
        System.out.println("Test des Scanners");
        MyReader reader = getInstance();
        String in = reader.getString("Text eingeben: ");
        System.out.println("Einagbe war  : " + in);
        int c = reader.getInt("Ganze Zahl eingeben : ");
        System.out.println("Eingabe war         : " + c);
        double d = reader.getDouble("Rationale Zahl eingeben : ");
        System.out.println("Einagbe war             : " + d);
    }
}
