import java.util.Scanner;

/**
 * author @Nadina Amlser (shirin197)
 * date    24.11.2021
 * version 1.0v
 * */

public class konvertertwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein : ");
        int dezzahl = scanner.nextInt();
        System.out.println("Deine Zahl in Binär lautet: ");
        printbin(dezzahl);
        System.out.println();
        System.out.println("Deine Zahl in Hex lautet: ");
        printhex(dezzahl);

    }
    // Recursion
    static void printbin(int number){
        int rem;
        if (number <= 1) {
            System.out.print(number); // print damit alles nacheinader ausgegeben wird
            return;
        }
        rem = number % 2;
        printbin(number / 2);
        System.out.print(rem);
    }

    static void printhex(int number){
        //Array
        char[] charHexa ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexVal = "";
        int rem;

        while(number > 0){
            rem = number % 16;
            hexVal = charHexa[rem] + hexVal;
            number = number / 16;
        }
        System.out.println(hexVal);
    }
}
