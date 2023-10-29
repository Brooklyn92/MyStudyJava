package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodIsEmpty {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Иван");

        boolean isEmptyArrayList = arrayList1.isEmpty(); // => Возвращает true, если arrayList пуст и false, если arrayList не пустой.
        System.out.println(isEmptyArrayList); // => false
    }
}
