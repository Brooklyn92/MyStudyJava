package udemy_base_java.lesson25_polimorfizm;

public class PolimorfizmTest2 {
    public static void main(String[] args) {
        Employee2 emp1 = new Doctor2();
        Employee2 emp2 = new Teacher2();
        Employee2 emp3 = new Drive2();
        Employee2 emp4 = new Employee2();
        Employee2 [] array = {emp1,emp2,emp3,emp4};
        for (Employee2 e: array) {
            if (e instanceof Drive2) {
                System.out.println(((Drive2)e).nameCar="Ford");
                ((Drive2)e).drive();
            }
        }
//        Help_able2 h1  = new Doctor2();
//        h1.help(); // -> у переменной h1 вызывается только один метод интерфейса help
//        System.out.println(((Doctor2)h1).specializaciya); // теперь переменная h1 может вызывать поля и методы класса Doctor2
//        Doctor2 d1 = (Doctor2) emp1; // Вариант1 -> используем casting, что бы emp1 принимал значения класса Doctor2
//        System.out.println(((Doctor2)emp2).specializaciya); // Вариант2
    }
}

class Employee2 {
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

class Doctor2 extends Employee2 implements Help_able2 {
    String specializaciya = "Терапевт";
    public void help() {
        System.out.println("Доктор оказывает помощь");
    }
    void treat () {
        System.out.println("Лечить");
    }
}

class Teacher2  extends Employee2 {
    String countStudents;
    void teach () {
        System.out.println("Учить");
    }
}

class Drive2  extends Employee2 {
    String nameCar;
    void drive () {
        System.out.println("Водить");
    }
}
interface Help_able2 {
    void help();
}
