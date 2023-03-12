package udemy_advanced_java.generics.lesson1;

public class Info<T> {
    private T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{" + value +
                '}';
    }

    public T getValue() {
        return value;
    }
}
