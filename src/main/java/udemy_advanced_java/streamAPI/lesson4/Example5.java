package udemy_advanced_java.streamAPI.lesson4;

import java.util.Arrays;
import java.util.List;

public class Example5 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("foo", "bar", "baz", "qux");
        String result = strings.stream().reduce((x,y) -> x + ", " + y).orElse(null);
        System.out.println(result); // => foo, bar, baz, qux - объединение всех элеметов строки через запятую

    }
}
