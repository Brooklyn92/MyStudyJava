package lesson24_abstract_class_and_abstract_method_and_Interface;

public interface I1 {
    void abc();
    default void def() {
        System.out.println("Этот метод def");
    }
    static void staticMethod() {
        System.out.println("Это статический метод");
    }
}
