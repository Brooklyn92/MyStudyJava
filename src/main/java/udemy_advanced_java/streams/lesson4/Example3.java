package udemy_advanced_java.streams.lesson4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example3 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        Optional<Integer> product = numbers.stream().reduce((x,y) -> x*y);
        System.out.println(product.get()); // => 120 - произведение всех чисел в потоке
    }
}
