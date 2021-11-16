package a226.f3_3;

public class Rechner {

    public static void main(String[] args) {
        new Rechner().run();
    }

    public void run(){
        System.out.println(exponieren(4, 3));
        System.out.println(exponieren(4, 1));
        System.out.println(exponieren(7, 0));
        System.out.println(exponieren(3, -1));
    }

    public String exponieren(int n1, int n2){
        if (n2 >= 0) {
            int res = 1;
            for (int i = 0; i < n2; i++) {
                res *= n1;
            }
            return res + "";
        }else {
            return "Ungültige Operation";
        }
    }
}