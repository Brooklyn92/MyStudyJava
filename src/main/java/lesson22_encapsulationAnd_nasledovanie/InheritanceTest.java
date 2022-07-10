package lesson22_encapsulationAnd_nasledovanie;

public class InheritanceTest {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.name = "IVAN";
        doctor.age = 50;
        doctor.experience = 25;
        doctor.specializaciya = "Terapevt";
        doctor.eat();
        doctor.sleep();
        doctor.treat();
    }

}
class Employee {
    String name;
    int age;
    int experience;
    void eat() {
        System.out.println("Кушать");
    }
    void sleep() {
        System.out.println("Спать");
    }
}

class Doctor extends Employee {
    String specializaciya;
    void treat () {
        System.out.println("Лечить");
    }
}

class Teacher  extends Employee {
    String countStudents;
    void teach () {
        System.out.println("Учить");
    }
}

class Driver  extends Employee {
    String nameCar;
    void drive () {
        System.out.println("Водить");
    }
}