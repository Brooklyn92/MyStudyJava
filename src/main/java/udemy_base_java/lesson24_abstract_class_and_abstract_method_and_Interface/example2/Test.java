package udemy_base_java.lesson24_abstract_class_and_abstract_method_and_Interface.example2;

public class Test {

    public static void main(String[] args) {
        Info info1 = new Animal(1);
        Info info2 = new Person("Bob");
//        info1.showInfo();
//        info2.showInfo();
        outputInfo(info1); // => Этот айди: 1
        outputInfo(info2); // => Имя человека: Bob


        Animal animal = new Animal(2);
        Person person = new Person("Alex");
        outputInfo(animal); // вызываемый метод, который по умолчанию принимает интерфейс, так же может принимать объекты, которые имплементировали этот интерфейс.
        outputInfo(person);
    }
    public static void outputInfo(Info info) {
        info.showInfo();
    }
}
