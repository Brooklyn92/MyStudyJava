package udemy_base_java.Lesson23_Overriding_Hiding_Final;

public class Test2 {
    public static void main(String[] args) {
        Employee1 employee1 = new Teacher1();
        employee1.eat();
    }
}

class Food {}
class Fruits extends Food{}

class Employee1 {
    String name;
    int age;
    int experience;
    Food eat() {
        System.out.println("Кушает работник");
        Food food = new Food();
        return food;
    }
    void sleep() {
        System.out.println("Спать");
    }
}

class Teacher1 extends Employee1 {

    Fruits eat() {
        System.out.println("Кушает учитель");
        Fruits fruits = new Fruits();
        return fruits;
    }

    void teach () {
        System.out.println("Учить");
    }
}