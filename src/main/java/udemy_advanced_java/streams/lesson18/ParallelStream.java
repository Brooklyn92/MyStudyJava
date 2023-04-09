package udemy_advanced_java.streams.lesson18;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        list.add(10.0);
        list.add(5.0);
        list.add(1.0);
        list.add(0.25);

//        double sumRes = list.stream().reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println(sumRes); // => 16.25

//        double sumRes = list.parallelStream().reduce((accumulator, element) -> accumulator + element).get();
//        System.out.println(sumRes); // => 16.25

        double divisionRes = list.parallelStream().reduce((accumulator, element) -> accumulator/element).get();
        System.out.println(divisionRes); // => 0.5(через метод parallelStream); => 8.0(через метод stream)
    }
}
