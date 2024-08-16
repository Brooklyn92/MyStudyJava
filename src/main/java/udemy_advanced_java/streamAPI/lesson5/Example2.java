package udemy_advanced_java.streamAPI.lesson5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5,3,2,8,1,4);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers); //  => [1, 2, 3, 4, 5, 8]
    }
}
