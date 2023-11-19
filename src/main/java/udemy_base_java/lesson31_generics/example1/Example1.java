package udemy_base_java.lesson31_generics.example1;


public class Example1 {
    public static void main(String[] args) {
        Info<String> info = new Info<>("Привет");
        System.out.println(info); // => Info{value=Привет}

        String s = info.getValue();
        System.out.println(s); // => Привет

        Info<Integer> info2 = new Info<>(100);
        System.out.println(info2); // => Info{value=100}

    }
}
