package F3_2;

public class Rechner {
    public static void main(String[] args) {
        // Hier wird eine Objektreferenz vom Typ MathOp deklariert.
        // Erst zur Laufzeit wird dann entschieden, um welche konkrete
        // Unterklasse es sich handeln soll.
        // Durch nutzen der Polymorphie (overwriting) wird die passende execOp()
        // Methode zur Laufzeit dann ausgeführt.
        MathOp rechner = null;
        //
        // Tokenizer- und MyReader-Objekt erzeugen
        // ...do it


        //
        // Hier gibt die Applikation bekannt, was sie genau macht.
        // Nichts schlimmeres als Programme, bei denen Sinn und Zweck unklar sind!
        // ...do it


        // nun einen String mit der Rechnung einlsen und dann in die einzelnen
        // Token aufteilen.
        // ...do it


        // Hier geben Sie als Test die 3 Token (Zahl, Operation, Zahl) aus
        // ...do it


        // JETZT WIRD'S SPANNEND
        // Mittels switch-case (oder auch if-else-if) kann ausfindig gemacht
        // werden, welche Operation gefragt ist.
        // Nun also die entsprechende Klasse instanzieren.
        // Aber Achtung!
        // Die Referenzvariable rechner existiert schon. Unbedingt diese
        // benutzen. Sie ist ja von der Oberklasse und passt daher immer.
        // ...do it


        // Und jetz lassen wir's krachen.
        // Egal von welcher konkreten Klasse das erzeugte Objekt ist, es
        // kann immer eine execOp() ausführen. Und dann kann auch noch
        // das Ergebnis ausgegeben werden.
        // Aber das machen wir natürlich nur, wenn die referenz nicht null ist.
        // ..do it


    }


}
