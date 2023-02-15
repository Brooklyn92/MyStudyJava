package udemy.lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("poka");
        list.add("privet");
        list.add("ok");
        list.add(1,"hello"); // добавление элемента "hello" на первый индекс, т.е. слово "privet" и последующие элементы сместятся на один индекс вправо.
        for (String s: list) {
            System.out.print(s+ " ");
            list.set(1, "!!!");
            System.out.println(s + " ");//устанавливает значение в определённый индекс, так же может перезаписывать уже существующее значение
        }

        System.out.println();
        System.out.println(list.get(3)); // выводит элемент под 3 индексом

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Sidorov");
        list2.add("Petrov");
        //list.addAll(list2); // добавление значений другого ArrayList. Типы данных должны совпадать.
        list.addAll(1, list2); // добавление значений другого ArrayList начиная с определённого индекса

        for (int i = 0; i<list.size(); i++) { // можно перебрать элементы ArrayList с помощью цикла for чезез получения индекса.
            System.out.print(list.get(i)+ " ");
        }
        //list.clear(); -  отчищает ArrayList




    }
}
