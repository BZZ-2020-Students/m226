package F3_2;

public class Tokenizer {
    private float zahl1;
    private float zahl2;
    private char operation;

    public Tokenizer() {
    }

    public void split(String cmd) {
        if (cmd.indexOf(43) != -1) {
            this.operation = '+';
            this.extract(cmd, this.operation);
        } else if (cmd.indexOf(45) != -1) {
            this.operation = '-';
            this.extract(cmd, this.operation);
        } else if (cmd.indexOf(42) != -1) {
            this.operation = '*';
            this.extract(cmd, this.operation);
        } else if (cmd.indexOf(47) != -1) {
            this.operation = '/';
            this.extract(cmd, this.operation);
        } else if (cmd.indexOf(94) != -1) {
            this.operation = '^';
            this.extract(cmd, this.operation);
        } else {
            this.operation = '0';
        }

    }

    private void extract(String cmd, char op) {
        try {
            this.zahl1 = new Float(cmd.substring(0, cmd.indexOf(op)).trim());
            this.zahl2 = new Float(cmd.substring(cmd.indexOf(op) + 1, cmd.length()).trim());
        } catch (NumberFormatException var4) {
            this.operation = '0';
        }

    }

    public float getValue1() {
        return this.zahl1;
    }

    public float getValue2() {
        return this.zahl2;
    }

    public char getOperation() {
        return this.operation;
    }
}

