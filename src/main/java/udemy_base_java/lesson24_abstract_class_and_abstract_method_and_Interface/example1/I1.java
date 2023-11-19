package udemy_base_java.lesson24_abstract_class_and_abstract_method_and_Interface.example1;

public interface I1 {
    void abc();
    default void def() {
        System.out.println("Этот метод def");
    }
    static void staticMethod() {
        System.out.println("Это статический метод");
    }
}
