package udemy_base_java.lesson30_lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaExample4 {
    public static void main(String[] args) {
        List<String> list = List.of("Привет","Пока","Как дела?","Всё нормально");

        //--Вариант перебора List через классический for each
//        for (String s:list) {
//            System.out.println(s);
//        }

        //--Вариант перебора List через метод list forEach, внутри которого используется реализация лямбды выражения
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(3);
        a1.add(6);
        a1.add(7);
        a1.add(4);
        a1.add(2);
        a1.add(5);
        a1.add(1);

        //--Первый вариант удаление элементов по условию лямбды выражения
//        a1.removeIf(element -> element%3==0); => [7, 4, 2, 5, 1]
//        System.out.println(a1);

        //--Второй вариант удаление элементов по условию лямбды выражения через интерфейс Predicate напрямую
//        Predicate<Integer> p = element -> element%3==0;
//        a1.removeIf(p);
//        System.out.println(a1); // => [7, 4, 2, 5, 1]

        //Сортировка массива через лябмду выражения методом ArrayList sort
        a1.sort((x,y) -> x.compareTo(y));
        System.out.println(a1); // => [1, 2, 3, 4, 5, 6, 7]
    }
}
