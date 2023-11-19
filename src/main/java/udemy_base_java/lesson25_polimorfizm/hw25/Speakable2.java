package udemy_base_java.lesson25_polimorfizm.hw25;

public interface Speakable2 {
    default void speak(){
        System.out.println("Somebody speak");
    }
}
