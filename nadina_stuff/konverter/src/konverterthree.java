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
                System.out.println("Deine Zahl in Oktal lautet: ");
                printokt(dezzahl);
                break;
            case 4:
                System.out.println("Deine Zahl in Binär lautet: ");
                System.out.print(ConsoleColors.GREEN);
                printbin(dezzahl);
                System.out.print(ConsoleColors.RESET);
                System.out.println();
                System.out.println("Deine Zahl in Hex lautet: ");
                System.out.print(ConsoleColors.GREEN);
                printhex(dezzahl);
                System.out.print(ConsoleColors.RESET);
                System.out.println("Deine Zahl in Oktal lautet: ");
                System.out.print(ConsoleColors.GREEN);
                printokt(dezzahl);
                System.out.print(ConsoleColors.RESET);
                break;
        }
    }

    public static void printef(){
        System.out.println(ConsoleColors.BLUE_BOLD + ConsoleColors.BLUE_UNDERLINED +"In Welches Zahlensystem wollen sie Ihre Zahl umwandeln?");
        System.out.print(ConsoleColors.RESET);  // Damit die Farbe auf Standart zurückgestellt wird.
        System.out.println("In Binär schreiben Sie eine - 1");
        System.out.println("In Hex schreiben Sie eine   - 2");
        System.out.println("In Oktal schreiben Sie eine - 3");
        System.out.println("In alle schreiben Sie eine  - 4");
    }

    // Recursion
    static void printbin(int number){
        int rem1;
        if (number <= 1) {
            System.out.print(number); // print damit alles nacheinader ausgegeben wird
            return;
        }
        rem1 = number % 2;
        printbin(number / 2);
        System.out.print(rem1);
    }

    static void printhex(int number){
        //Array
        char[] charHexa ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexVal = "";
        int rem2;

        while(number > 0){
            rem2 = number % 16;
            hexVal = charHexa[rem2] + hexVal;
            number = number / 16;
        }
        System.out.println(hexVal);
    }

    static void printokt(int number) {
        char[] octalchars = {'0', '1', '2', '3', '4', '5', '6', '7'};
        String octVal = "";
        int rem3;

        while (number > 0) {
            rem3 = number % 8;
            octVal = octalchars[rem3] + octVal;
            number = number / 8;
        }
        System.out.println(octVal);
    }
}
