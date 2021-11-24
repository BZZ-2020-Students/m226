import java.util.Scanner;

/**
 * author @Nadina Amlser (shirin197)
 * date    24.11.2021
 * version 1.0v
 * */

public class konverter {
    public static void main(String[] args) {

        // User Input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein : ");
        int dezzahl = scanner.nextInt();                //Überprüfung ob input eine natürliche Zahl ist

        // Binärezahl
        System.out.println("Deine Zahl in Binär lautet: ");
        System.out.println(Integer.toBinaryString(dezzahl));

        // Hexadecimalzahl
        System.out.println("Deine Zahl in Hex lautet: ");
        System.out.println(Integer.toHexString(dezzahl));
    }
}
