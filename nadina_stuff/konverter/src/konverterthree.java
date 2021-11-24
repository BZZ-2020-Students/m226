import java.util.Scanner;

/**
 * author @Nadina Amlser (shirin197)
 * date    24.11.2021
 * version 1.0v
 * */

public class konverterthree {
    public static void main(String[] args) {
        printef();
        System.out.println();
        System.out.println("Dezimal Zahl: ");
        Scanner scanner = new Scanner(System.in);
        int dezzahl = scanner.nextInt();
        System.out.println("Gewünschtes Zahlensystem:");
        Scanner scanner1 = new Scanner(System.in);
        int input = scanner1.nextInt();

        switch(input) {
            case 1:
                System.out.println("Deine Zahl in Binär lautet: ");
                printbin(dezzahl);
                break;
            case 2:
                System.out.println("Deine Zahl in Hex lautet: ");
                printhex(dezzahl);
                break;
            case 3:
                System.out.println("Deine Zahl in Binär lautet: ");
                printbin(dezzahl);
                System.out.println();
                System.out.println("Deine Zahl in Hex lautet: ");
                printhex(dezzahl);
        }
    }

    public static void printef(){
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED +"In Welches Zahlensystem wollen sie Ihre Zahl umwandeln?");
        System.out.print(ConsoleColors.RESET);  // Damit die Farbe auf Standart zurückgestellt wird.
        System.out.println("In Binär schreiben Sie eine - 1");
        System.out.println("In Hex schreiben Sie eine   - 2");
        System.out.println("In beide schreiben Sie eine - 3");
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
        System.out.print(rem);  System.out.print(rem);
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
