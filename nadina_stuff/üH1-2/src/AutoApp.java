public class AutoApp {
    public static void main(String[] args) {
        Autoliste li = new Autoliste();
        AutoApp app = new AutoApp();

        // 4 Auto hinzuf�gen
        li.addAuto(new Auto("Toyota", "ZH 333444"));
        li.addAuto(new Auto("VW", "GE 111222"));
        li.addAuto(new Auto("Porsche", "BE 1"));
        li.addAuto(new Auto("Fiat", "TI 5556677"));

        app.print(li);

        // 1 Auto �ber Index l�schen
        li.removeAuto(3);
        app.print(li);

        // 1 Auto �ber Objektreferenz l�schen
        Auto a = li.getAuto(2);
        li.removeAuto(a);
        app.print(li);
    }

    public void print(Autoliste liste){
        for(int i = 0; i < liste.getSize(); i++){
            System.out.println("Auto " + i + ": " + liste.getKennzeichen(i) + " - " + liste.getMarke(i));
        }
        System.out.println("-----------------------------------------------------------");
    }

}
