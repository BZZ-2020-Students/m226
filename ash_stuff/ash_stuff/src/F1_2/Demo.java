package F1_2;

public class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee("Ash", 16, 1, 1500, "076 246 64 20");
        Customer customer = new Customer("Tim", 18, emp);
        Regular reg = new Regular("Phillip", 16, emp, 0.5f);

        emp.print();
        System.out.println();
        customer.print();
        System.out.println();
        reg.print();
    }
}
