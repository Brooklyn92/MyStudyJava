package udemy_advanced_java.generics.lesson1;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Привет");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(2);
        System.out.println(info2);
    }
}
