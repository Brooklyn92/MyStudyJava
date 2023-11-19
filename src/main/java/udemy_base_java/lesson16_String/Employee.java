package udemy_base_java.lesson16_String;

public class Employee {
    double salary;
    boolean isManager;

    public Employee(double salary, boolean isManager) {
        this.salary = salary;
        this.isManager = isManager;
    }
}

class TestEmployee {

    public static void main(String[] args) {
        Employee emp = new Employee(100.5,true);
        System.out.println("Он менеджер? " + emp.isManager + ", его зарплата " + emp.salary);
    }


}
