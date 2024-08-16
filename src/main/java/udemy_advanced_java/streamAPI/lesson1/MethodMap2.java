package udemy_advanced_java.streamAPI.lesson1;

import java.util.ArrayList;
import java.util.List;

public class MethodMap2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Go");
        list.add("Python");
        list.add("Ruby");

//        List<Integer> list1 = list.stream().map(String::length).collect(Collectors.toList());
//        System.out.println(list1); //  => [4, 2, 6, 4]

//        list = list.stream().map(s -> s.toUpperCase(Locale.ROOT)).filter(s -> s.contains("P")).collect(Collectors.toList());
//        System.out.println(list.stream().findFirst().get()); // PYTHON

//        List<Integer> list1 = list.stream().map(s -> s.length() * 2).collect(Collectors.toList());
//        System.out.println(list1); //  => [8, 4, 12, 8]
    }
}
