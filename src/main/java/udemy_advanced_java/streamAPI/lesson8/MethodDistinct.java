package udemy_advanced_java.streamAPI.lesson8;

import java.util.stream.Stream;

public class MethodDistinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,5,1,2,3);
        stream1.distinct().forEach(System.out::println); // => 1,2,3,4,5. Метод distinct возвращает только уникальные элементы стрима.
    }
}
