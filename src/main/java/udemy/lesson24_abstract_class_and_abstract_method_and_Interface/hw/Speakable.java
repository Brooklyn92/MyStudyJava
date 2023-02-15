package udemy.lesson24_abstract_class_and_abstract_method_and_Interface.hw;

public interface Speakable {
    default void speak(){
        System.out.println("Somebody speak");
    }
}
