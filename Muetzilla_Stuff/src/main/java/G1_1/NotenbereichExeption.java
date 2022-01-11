package G1_1;

public class NotenbereichExeption extends Exception {
    public NotenbereichExeption() {
        super("Der Notenwert muss im Bereich 1.0 bis 6.0 liegen");
    }
}
