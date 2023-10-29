package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodIndexOf {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");

        int index = arrayList1.indexOf("Иван"); // => Возвращает индес искомого объекта.
        System.out.println(index); // => 1
    }
}
