import java.util.Scanner;

public class rekursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gebe eine Zahl ein : ");
        int i = scanner.nextInt();
        int x = 0;

        rekursion rek = new rekursion();
        rek.rekursion(i, x);
    }
    private void rekursion(int i, int x){
        if(x != i){
            x++;
            System.out.println(x);
                rekursion(i, x);
        }
    }
}
