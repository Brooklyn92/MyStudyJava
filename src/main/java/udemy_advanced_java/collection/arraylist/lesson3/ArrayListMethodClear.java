package udemy_advanced_java.collection.arraylist.lesson3;

import java.util.ArrayList;

public class ArrayListMethodClear {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        System.out.println(arrayList1); // => [Заур, Иван, Мария]

        arrayList1.clear(); // => Метод clear() очищает список, удаляя из него все элементы.
        System.out.println(arrayList1); // => [].
    }
}
