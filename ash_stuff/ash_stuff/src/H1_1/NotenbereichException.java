package H1_1;

public class NotenbereichException extends Exception {
    public NotenbereichException() {
        super("Der Notenwert muss im Bereich 1.0 bis 6.0 liegen");
    }
}
