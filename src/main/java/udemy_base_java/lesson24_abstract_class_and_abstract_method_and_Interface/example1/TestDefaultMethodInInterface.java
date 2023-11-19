package udemy_base_java.lesson24_abstract_class_and_abstract_method_and_Interface.example1;

public class TestDefaultMethodInInterface {
    public static void main(String[] args) {
        Z z1 = new Z();
        z1.abc(); // -> обращение к перезаписанному методу abc
        z1.def(); // -> обращение к default методу интерфейса не обязательно, а так же нет необходимости его перезаписывывать, но такая возможность есть.
        I1.staticMethod();// -> обращение к статическому методу происходит только через имя интерфейса
     }
}
class Z implements I1 {
    public void abc() {
        System.out.println("Этот метод abc"); // -> перезаписываем абстрактный метод abc интерфейса I1
    }
}