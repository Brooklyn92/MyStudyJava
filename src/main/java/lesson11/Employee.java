package lesson11;

public class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double uvelichitel() {
        salary = salary*2;
        return salary;

    }
}
class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ivan", 100.5);
        employee1.uvelichitel();
        System.out.println(employee1.salary);

    }
}
