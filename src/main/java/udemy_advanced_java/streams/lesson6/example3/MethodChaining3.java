package udemy_advanced_java.streams.lesson6.example3;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MethodChaining3 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4,5,1,2,3);
        stream.filter(el -> {
            System.out.println("!!!");
            return el%2==0;
        }).collect(Collectors.toList());
    }
}
