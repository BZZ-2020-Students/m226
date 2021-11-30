import java.util.Scanner;

public class jahreszahl {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gebe eine jahreszahl ein: ");
        int jahreszahl = input.nextInt();

            if(jahreszahl % 4 == 0 && (jahreszahl % 100 == 0 ^ jahreszahl % 400 == 0)){
                System.out.println("Das Jahr " + jahreszahl + " ist kein Schaltjahr");
            }else {
                System.out.println("Das Jahr " + jahreszahl + " ist ein Schaltjahr");
        }
    }
}
