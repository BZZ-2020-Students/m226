package examples;

public class Bottle {
    private int fill;
    private String name;
    private int size;
    private boolean open;

    public Bottle() {   }

    public Bottle(int fill, String name) {
        this.fill = fill;
        this.size = fill;
        this.name = name;
        validateFill();
    }

    private void validateFill() {
        fill = Math.min(fill, size);
    }

    public int getFill() {
        return fill;
    }

    public void setFill(int fill) {
        if (!open) return;
        this.fill = fill;
        validateFill();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
        validateFill();
    }

    public boolean isOpen() {
        return open;
    }

    public void open() {
        open = true;
    }

    public void close() {
        open = false;
    }
}
