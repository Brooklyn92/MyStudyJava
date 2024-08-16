package udemy_advanced_java.streamAPI.lesson4;

import java.util.ArrayList;
import java.util.List;

public class MethodReduce {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator,element) ->
                accumulator*element).get();
//        System.out.println(result); // => 960
        //изначальные значения: 5,8,3,4,3
        //accumulator = 5, 40, 80, 320, 960
        //element = 8,2,4,3

        int result2 = list.stream().reduce(1,(accumulator,element) ->  //значение 1 означает, что первым значением accumulator вместо 5 будет 1
                accumulator*element);
        //изначальные значения: 5,8,3,4,3
        //accumulator = 1, 5, 40, 80, 320, 960
        //element = 8,2,4,3
        System.out.println(result2); // => 960

//=============Разбор присваивания стрима классу Optional и его методов====================
//        List<Integer> list100 = new ArrayList<>();
//        Optional<Integer> o = list100.stream().reduce((accumulator, element) ->
//                accumulator*element);
//
//        if (o.isPresent()) {
//            System.out.println(o.get());
//        } else {
//            System.out.println("no present");
//        }

        List<String> list3 = new ArrayList<>();
        list3.add("привет");
        list3.add("пока");
        list3.add("как дела?");
        list3.add("хорошо");
        String result3 = list3.stream().reduce((a,e) ->
                a + " " + e).get();
        System.out.println(result3); // => привет пока как дела? хорошо. В данном примере между значениями добавляется пробел
    }
}
