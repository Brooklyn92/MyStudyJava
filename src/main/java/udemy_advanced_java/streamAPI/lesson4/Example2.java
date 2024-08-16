package udemy_advanced_java.streamAPI.lesson4;

import java.util.Arrays;
import java.util.List;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        int sum = numbers.stream().reduce(0,(acc, val) -> acc+val);
        System.out.println(sum); // => 15 - сумма всех числе в потоке
    }
}
