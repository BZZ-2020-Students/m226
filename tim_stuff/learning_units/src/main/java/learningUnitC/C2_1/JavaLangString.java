package learningUnitC.C2_1;

public class JavaLangString {
    public JavaLangString(String s1, String s2) {
        if (s1.equals(s2)) {
            System.out.println("jup");
        } else {
            System.out.println("nope");
        }
    }

    public static void main(String[] args) {
        new JavaLangString("hallo", "hallo2");
    }
}
