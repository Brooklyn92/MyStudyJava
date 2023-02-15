package udemy.lesson22_encapsulationAnd_nasledovanie;

public class Human {

    public String name = "Николай";
    public static int salary = 150;
    public void work() {
        System.out.println("Работать");
    }
    public static void reat() {
        System.out.println("Отдыхать");
    }
}
class Student extends Human {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(salary);
        s.work();
        reat();
    }

}
