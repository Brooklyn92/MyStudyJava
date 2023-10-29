package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodLastIndexOf {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Иван");

        int index = arrayList1.lastIndexOf("Иван"); // => Возвращает индес последнего совпадения искомого объекта.
        System.out.println(index); // => 3
    }
}
