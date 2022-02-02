package lesson6;

public class Employee2 {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    //Стандартная перегрузка конструктора
    public Employee2(int id, String surname, int age) {
        this.id = id;
        this.surname = surname;
        this.age = age;
    }

    public Employee2(String surname, int age) {
        this.surname = surname;
        this.age = age;
    }

    public Employee2(int id, String surname, int age, double salary, String departament) {
        this.id = id;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.departament = departament;
    }
}

class Employee2Test {
    public static void main(String[] args) {
        Employee2 employee2 = new Employee2(1,"Alex", 23, 23.92, "IT");
        Employee2 employee3 = new Employee2(1,"Alex", 23);
        Employee2 employee4 = new Employee2("Alex", 23);
    }
}
