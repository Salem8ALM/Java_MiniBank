import Bank.Employee;
import Bank.User;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("imaUser","user123","1234", "ahmed",999);
        System.out.println(employee.toString());

        System.out.println(employee.calculateSalary(10,"bonus"));
        System.out.println(employee.calculateSalary(5,"deduction"));
        System.out.println(employee.calculateSalary(4, "mmmm"));

        System.out.println(employee.);
    }
}