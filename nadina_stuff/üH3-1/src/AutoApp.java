public class AutoApp {
    public static void main(String[] args) {
        Autoliste li = new Autoliste();

        li.addAuto(new Auto("Toyota", "ZH 333444"));
        li.addAuto(new Auto("VW", "GE 111222"));
        li.addAuto(new Auto("MacLaren", "BE 1"));
        li.addAuto(new Auto("Fiat", "TI 5556677"));
        li.addAuto(new Auto("Honda", "GL 13611"));
        li.addAuto(new Auto("Toyota", "SG 219287"));
        li.addAuto(new Auto("Ferrari", "ZH 6666"));
        li.addAuto(new Auto("Alfa Romeo", "ZH 15876523"));
        li.addAuto(new Auto("Ferrari", "AG 1"));
        li.addAuto(new Auto("Suzuki", "ZH 76344"));
        li.addAuto(new Auto("Fiat", "TI 22356"));
        li.addAuto(new Auto("Honda", "AG 52145"));
        li.addAuto(new Auto("VW", "GL 5236"));

        li.printListe();

        li.sortiereAuto();
        li.printListe();
    }
    /*
    public void print(Autoliste liste){
        for(int i = 0; i < liste.getSize(); i++){
            System.out.println("Auto " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
        System.out.println("-----------------------------------------------------------");
    }*/
}
