package a226.f3_2;

public class Rechner {

    public static void main(String[] args) {
        // Hier wird eine Objektreferenz vom Typ MathOp deklariert.
        // Erst zur Laufzeit wird dann entschieden, um welche konkrete
        // Unterklasse es sich handeln soll.
        // Durch nutzen der Polymorphie (overwriting) wird die passende execOp()
        // Methode zur Laufzeit dann ausgeführt.
        MathOp rechner = null;

        // Tokenizer- und MyReader-Objekt erzeugen
        MyReader reader = MyReader.getInstance();
        Tokenizer token = new Tokenizer();

        // Hier gibt die Applikation bekannt, was sie genau macht.
        // Nichts schlimmeres als Programme, bei denen Sinn und Zweck unklar sind!
        System.out.println("Diese Klasse verwaltet die Eingaben mit den Richtigen Klassen und dient als Taschenrechner");
        System.out.println("Geben Sie eine Grundoperation mit zwei Zahlen ein, z.B. 5+2 oder 8/5.4 usw.");

        // nun einen String mit der Rechnung einlsen und dann in die einzelnen
        // Token aufteilen.
        String in = reader.getString("Rechnung : ");
        token.split(in);
        char op = token.getOperation();
        float value1 = token.getValue1();
        float value2 = token.getValue2();

        // Hier geben Sie als Test die 3 Token (Zahl, Operation, Zahl) aus
        rechner = new Addierer();
        rechner.execOp(value1,value2);
        rechner.printResult();

        // JETZT WIRD'S SPANNEND
        // Mittels switch-case (oder auch if-else-if) kann ausfindig gemacht
        // werden, welche Operation gefragt ist.
        // Nun also die entsprechende Klasse instanzieren.
        // Aber Achtung!
        // Die Referenzvariable rechner existiert schon. Unbedingt diese
        // benutzen. Sie ist ja von der Oberklasse und passt daher immer.
        if (op == '+') {
            rechner = new Addierer();
        } else if (op == '-') {
            rechner = new Subtrahierer();
        } else if (op == '*') {
            rechner = new Multiplizierer();
        } else if (op == '/') {
            rechner = new Dividierer();
        } else {
            System.out.println("Fehler!!!");
        }

        // Und jetz lassen wir's krachen.
        // Egal von welcher konkreten Klasse das erzeugte Objekt ist, es
        // kann immer eine execOp() ausführen. Und dann kann auch noch
        // das Ergebnis ausgegeben werden.
        // Aber das machen wir natürlich nur, wenn die referenz nicht null ist.
        if (rechner != null) {
            System.out.println("1.Zahl\t\t: " + value1);

            System.out.println("Operation ist : " + op);
            System.out.println("2.Zahl\t\t: " + value2);

            rechner.execOp(value1, value2);
            rechner.printResult();
        }
    }
}
