package udemy.lesson24_abstract_class_and_abstract_method_and_Interface.example2;

public class Animal implements Info {
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    public void sleep() {
        System.out.println("Я сплю");
    }

    @Override
    public void showInfo() {
        System.out.println("Этот айди: " + id);
    }
}
