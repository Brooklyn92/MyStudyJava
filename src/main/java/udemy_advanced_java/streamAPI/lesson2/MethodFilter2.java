package udemy_advanced_java.streamAPI.lesson2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodFilter2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> oddNumbers = numbers.stream()
                .filter(n -> n % 2 != 0)
                .collect(Collectors.toList());
        System.out.println(oddNumbers); // выводит [1, 3, 5, 7, 9]
    }
}
