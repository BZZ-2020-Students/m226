package F1_2;

public class Regular extends Customer{
    private float sale;

    Regular(String name, int age, Employee contact, float sale){
        super(name, age, contact);
        this.sale = sale;
    }

    public float getSale() {
        return sale;
    }

    public void setSale(float sale) {
        this.sale = sale;
    }

    public void print(){
        System.out.println("Regular{" +
                "sale = " + sale +
                '}');
    }
}
