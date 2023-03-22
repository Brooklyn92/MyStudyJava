package udemy_advanced_java.streams.lesson3;

import java.util.Arrays;

public class MethodForEach {
    public static void main(String[] args) {
//        int[] array = {1,5,6,7,9};
//        Arrays.stream(array).forEach(el ->
//        {
//            el*=2;
//            System.out.println(el);
//        });

        int[] array = {1,5,6,7,9};
//        Arrays.stream(array).forEach(el -> System.out.println(el)); // => 1,5,6,7,9
//        Arrays.stream(array).forEach(System.out::println); // => 1,5,6,7,9
        Arrays.stream(array).forEach(Utils::myMethod);  // => Element = 6, Element = 10, Element = 11, Element = 12, Element = 14.
                                                        // Utils::myMethod - данная запись называется методов референс
    }
}
