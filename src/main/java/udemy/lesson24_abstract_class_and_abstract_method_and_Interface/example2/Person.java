package udemy.lesson24_abstract_class_and_abstract_method_and_Interface.example2;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Привет");
    }

    @Override
    public void showInfo() {
        System.out.println("Имя человека: " + name);
    }
}
