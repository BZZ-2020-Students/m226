import javafx.scene.transform.Scale;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int Summe = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eingabe: ");

        int Eingabe = sc.nextInt();
        while(Eingabe < 30){
            Summe = Summe + Eingabe;
            System.out.println(Summe);
            Eingabe = Eingabe + 6;
            System.out.println(Eingabe + "\b");
        }
    }
}
