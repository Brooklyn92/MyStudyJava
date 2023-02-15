package udemy.lesson7.hw7;

public class Employee {
     int id;
     public String surname;
     private double salary;

    public Employee(int id) {
        this.id = id;
    }

    Employee(String surname) {
        this.surname = surname;
    }

    private Employee(double salary) {
        this.salary = salary;
    }

    public void getId() {
        System.out.println(id);
    }

    public  void getSurname() {
        System.out.println(surname);
    }

    public void getSalary() {
        System.out.println(salary);
    }
}
