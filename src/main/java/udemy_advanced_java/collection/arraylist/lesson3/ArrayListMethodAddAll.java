package udemy_advanced_java.collection.arraylist.lesson3;

import java.util.ArrayList;

public class ArrayListMethodAddAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        System.out.println(arrayList1); // => [Заур, Иван, Мария]
        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("!!!");
        arrayList2.add("????");

        arrayList1.addAll(arrayList2); // => Метод добавляет в arrayList1 все элементы arrayList2. По умолчанию добавление происходит в конец массива.
        System.out.println(arrayList1); // => [Заур, Иван, Мария, !!!, ????]


        arrayList1.addAll(1, arrayList2); // => добавление в arrayList1 всех элементов arrayList2 с определённого массива
        System.out.println(arrayList1); // => [Заур, !!!, ????, Иван, Мария]
    }
}
