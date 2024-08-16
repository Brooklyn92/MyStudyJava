package udemy_advanced_java.streamAPI.lesson1;

import java.util.*;
import java.util.stream.Collectors;

public class MethodMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("привет");
        list.add("пока");
        list.add("как дела?");
        list.add("хорошо");

//=======Стандартный способ подмены значений в list=======================================================
//        for (int i = 0; i<list.size(); i++) {
//            list.set(i, String.valueOf(list.get(i).length()));
//        }
//        System.out.println(list); // => [6, 4, 9, 6]
// =====================================================================================================

//====Способ через метод stream MAP=====================================================================
        List<Integer> list2 = list.stream().map(element -> element.length()).collect(Collectors.toList());
//        System.out.println(list2); // => [6, 4, 9, 6]
//=======================================================================================================

//================Streams в массивах=====================================================================
        int[] array = {5, 8, 9, 3};
        array = Arrays.stream(array).map(element -> {
            if (element%3 == 0) {
                element = element / 3;
            }
            return element;
        }).toArray();
//        System.out.println(Arrays.toString(array)); // => [5, 8, 3, 1]
//=======================================================================================================

//================Streams в Set==========================================================================
        Set<String> set  = new TreeSet<>();
        set.add("привет");
        set.add("пока");
        set.add("как дела?");
        set.add("хорош");
        System.out.println(set); // =>[как дела?, пока, привет, хорош]

        Set<Integer> set2 = set.stream().map(e -> e.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(e -> e.length()).collect(Collectors.toList());
        System.out.println(set2); // => [4, 5, 6, 9]
        System.out.println(list3); // => [9, 4, 6, 5]. Сортировка, которая была у set сбрасывается, т.к. значение было присвоено List.
//===========================================================================================================
    }
}
