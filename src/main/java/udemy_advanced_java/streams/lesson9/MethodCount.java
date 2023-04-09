package udemy_advanced_java.streams.lesson9;

import java.util.stream.Stream;

public class MethodCount {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 1, 2, 3);
//        System.out.println(stream1.count()); // => 8. Метод count возвращает количество элементов в стриме.
        System.out.println(stream1.distinct().count()); // => 5 уникальный элементов стрима.
        // ВАЖНО:СТРИМ ПОСЛЕ ОБРАБОТКИ, НЕВОЗМОЖНО ПЕРЕИСПОЛЬЗОВАТЬ. Если не закомментировать обработку стрима на 8 строчке, то при запуске программы появится exception.
    }
}
