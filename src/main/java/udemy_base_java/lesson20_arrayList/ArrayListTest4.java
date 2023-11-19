package udemy_base_java.lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest4 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("шалом");
        list.add(sb1);
        list.add(new StringBuilder("пока"));
        list.add(new StringBuilder("привет"));
        list.add(new StringBuilder("хорошо"));
        list.add(1, new StringBuilder("здравствуй"));
        for(StringBuilder sb:list){
            System.out.print(sb+ "  ");
        }
        System.out.println(list.indexOf(new StringBuilder("привет")));// выдаёт индекс по одному из значений ArrayList. результат false, т.к. сравниваются два разных объекта
        System.out.println(list.contains(new StringBuilder("пока"))); // проверяет, есть ли такое значение в ArrayList
        System.out.println(list.contains(sb1)); // результат true, т.к. он сравнивает один и тот же объект
        System.out.println(list.toString()); // [шалом, здравствуй, пока, привет, хорошо]
    }
}
