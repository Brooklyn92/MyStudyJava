package udemy.lesson24_abstract_class_and_abstract_method_and_Interface;


public class InterfaceTest1 {
    //Help_able help_able = new Help_able(); // -> объект интерфейса создать не возможно, т.к. он не является классом.
    public static void main(String[] args) {
        Help_able h = new Driver();
        //h.helping(); -> переменная h которая ссылается на объект Driver может ссылать только на методы интерфейса Help_able
        Driver driver = new Driver();
        driver.helping(); // -> в данном случае переменная driver может ссылать на поля и методы объекта driver и интерфейса Help_able
    }

}


class Employee {
    double salary;
    String name;
    int age;
    int experience;

    void sleep() {
        System.out.println("Спать");
    }
    void eat() {
        System.out.println("Кушать");
    }
}

class Teacher extends Employee implements Help_able {
    String countStudents;
    void teach () {
        System.out.println("Учить");
    }
    public void helping() {
        System.out.println("Учитель оказывает помощь");
    }
    public void tushitPojar(){
        System.out.println("Учитель тушит пожар");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nameCar;
    void drive () {
        System.out.println("Водить");
    }
    public void helping() {
        System.out.println("Водитель оказывает помощь");
    }
    public void tushitPojar(){
        System.out.println("Водитель тушит пожар");
    }
    public void swim() {
        System.out.println("Водитель может плавать");
    }
}
