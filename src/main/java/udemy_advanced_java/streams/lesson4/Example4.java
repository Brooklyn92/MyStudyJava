package udemy_advanced_java.streams.lesson4;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Example4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,5,1,3,6);
        Optional<Integer> max = numbers.stream().reduce((x,y) -> x>y ? x:y);
        System.out.println(max.get()); // => 6  - максимальное число в потоке
    }
}
