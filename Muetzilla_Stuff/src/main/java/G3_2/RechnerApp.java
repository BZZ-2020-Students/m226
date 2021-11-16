package G3_2;

public class RechnerApp {

    public static void main(String[] args) {
        Rechner calc = new Rechner();
        try {
            System.out.println("15/3 --> Resultat    : " + calc.divide(15.0f, 3.0f));
            System.out.println("-15/3 --> Resultat   : " + calc.divide(-15.0f, 3.0f));
            System.out.println("15/-3 --> Resultat   : " + calc.divide(15.0f, -3.0f));
            System.out.println("-15/-3 ---> Resultat : " + calc.divide(-15.0f, -3.0f));
            System.out.println("a/5.0 --> Resultat   : " + calc.divide('a', 5.0f));
            System.out.println("100/a --> Resultat   : " + calc.divide(100.0f, 'a'));
            System.out.println("15/0 --> Resultat    : " + calc.divide(15.0f, 0.0f));
        } catch (DivideException ex) {
            System.out.println(ex.getMessage());
        }
    }
}