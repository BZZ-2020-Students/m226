public class polymorphie {

    public static void main(String[] args) {

        vierbeiner katze = new katze();
        hund doberman = new doberman();
        hund dalmatiner = new dalmatiner();
        vierbeiner dalmatiner1 = new dalmatiner();

        /* dalmatiner 1 kann kein objekt mit der Methode rasse() haben da dieser den typ Vierbeiner hat
         * und in der Oberklasse Vierbeiner gibt es nur diese Mehtode*/

        /* dalmatiner kann ein Objekt mit der Methode renn() und rasse()haben, das die Klasse Hund von vierbeiner erbt
        * und somit bei Methoden implementiert hat*/

        katze.renn();
        dalmatiner.rasse();
        dalmatiner1.renn();
        doberman.rasse();
        doberman.renn();

    }
}
