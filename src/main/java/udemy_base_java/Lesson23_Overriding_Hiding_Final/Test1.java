package udemy_base_java.Lesson23_Overriding_Hiding_Final;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Doctor(); // Объект emp1 класса Employee может ссылать на объект класса Doctor, т.к. класс Doctor является наследником класса Employee.
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();
    }
}

class Employee {
    double salary;
    String name;
    int age;
    int experience;

    Fruits eat() {
        System.out.println("Кушать");
        Fruits fruits = new Fruits();
        return fruits;
    }
    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee {
    String specializaciya;
    public void treat () {
        System.out.println("Лечить");
    }
}

class Teacher extends Employee {
    String countStudents;
    void teach () {
        System.out.println("Учить");
    }
}

class Driver extends Employee {
    String nameCar;
    void drive () {
        System.out.println("Водить");
    }
}