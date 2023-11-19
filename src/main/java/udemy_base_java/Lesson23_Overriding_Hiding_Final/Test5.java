package udemy_base_java.Lesson23_Overriding_Hiding_Final;

public class Test5 {
    public static void main(String[] args) {
        Employee2 e = new Teacher2();
        //e.sleep();//т.к. метод sleep в родительском классе имеет модификатор доступа private, то метод sleep в классе Teacher не перезаписывается
    }
}

class Employee2 {
    double salary;
    String name;
    Food eat() {
        System.out.println("Кушает работник");
        Food food = new Food();
        return food;
    }
    private void sleep() {
        System.out.println("Спит");
    }
}

class Teacher2 extends Employee2 {

    Fruits eat() {
        System.out.println("Кушает учитель");
        Fruits fruits = new Fruits();
        return fruits;
    }

    void teach () {
        System.out.println("Учить");
    }

    public void sleep() {
        System.out.println("Спит учитель");
    }
}