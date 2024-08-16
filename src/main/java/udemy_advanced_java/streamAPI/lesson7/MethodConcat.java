package udemy_advanced_java.streamAPI.lesson7;

import java.util.stream.Stream;

public class MethodConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        Stream<Integer> stream2 = Stream.of(1,2,3,4,5);
        Stream<Integer> stream3 = Stream.of(6,7,8,9,10);
        Stream<Integer> stream4 = Stream.concat(stream2,stream3);
        stream4.forEach(System.out::println); // => 1,2,3,4,5,6,7,8,9,10. Метод concat объединяет стримы
    }
}
