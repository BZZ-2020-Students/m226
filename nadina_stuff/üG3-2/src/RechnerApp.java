public class RechnerApp {

    public static void main(String[] args) {
        var calc = new Rechner();
        try {
            System.out.println("15/3 --> Resultat    : " + calc.divide(15.0f, 3.0f));
            System.out.println("-15/3 --> Resultat   : " + calc.divide(-15.0f, 3.0f));
            System.out.println("15/-3 --> Resultat   : " + calc.divide(15.0f, -3.0f));
            System.out.println("-15/-3 ---> Resultat : " + calc.divide(-15.0f, -3.0f));
            System.out.println("a/5.0 --> Resultat   : " + calc.divide('a', 5.0f));
            // Bemerkung: 'a' wird als 97 interpretiert (siehe Widening Casting unter
            // 			  https://www.w3schools.com/java/java_type_casting.asp)
            System.out.println("100/a --> Resultat   : " + calc.divide(100.0f, 'a'));
            System.out.println("15/0 --> Resultat    : " + calc.divide(15.0f, 0.0f));
        } catch (DivideException ex) {
            System.out.println(ex.getMessage());
        }
    }
}