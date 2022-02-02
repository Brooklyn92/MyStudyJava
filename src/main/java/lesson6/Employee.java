package lesson6;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String departament;

    public Employee(int id2, String surname2, int age2) {
        this(id2,surname2, age2, 0.0, null);
    }

     public Employee(String surname3, int age3) {
         this(0,surname3, age3, 0.0, null);
    }

     public Employee(int id4, String surname4, int age4, double salary4, String departament4) {
        id = id4;
        surname = surname4;
        age =age4;
        salary = salary4;
        departament = departament4;
    }

}
