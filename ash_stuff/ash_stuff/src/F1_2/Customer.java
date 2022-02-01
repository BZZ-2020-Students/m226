package F1_2;

public class Customer extends Person{
    protected Employee contact;

    Customer(String name, int age, Employee contact){
        super(name, age);
        this.contact = contact;
    }

    public Employee getContact() {
        return contact;
    }

    public void setContact(Employee contact) {
        this.contact = contact;
    }

    public void print(){
        System.out.println("Customer{" +
                "contact = " + contact +
                '}');
    }
}
