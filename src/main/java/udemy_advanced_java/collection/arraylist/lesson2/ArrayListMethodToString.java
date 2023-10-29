package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodToString {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Иван");

        System.out.println(arrayList1.toString()); // => [Заур, Иван, Мария, Иван]
    }
}
