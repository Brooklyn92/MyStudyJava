package udemy_advanced_java.collection.arraylist.lesson4;

import java.util.ArrayList;

public class ArrayListMethodRetainAll {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Николай");
        System.out.println(arrayList1); // => [Заур, Иван, Мария, Николай]

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Иван");
        arrayList2.add("Мария");
        arrayList2.add("Игорь");

        arrayList1.retainAll(arrayList2); // => Метод оставляет в коллекции только те элементы, которые есть в коллекции переданная в параметр метода.
        System.out.println(arrayList1); // => [Иван, Мария]

    }
}
