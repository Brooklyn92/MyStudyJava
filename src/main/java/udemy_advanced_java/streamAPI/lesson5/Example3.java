package udemy_advanced_java.streamAPI.lesson5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example3 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        List<String> sortedNames = names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sortedNames); // => [David, Charlie, Bob, Alice]
    }
}
