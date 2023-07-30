package udemy_advanced_java.collection.arraylist.lesson3;

import java.util.ArrayList;

public class ArrayListMethodContains {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");

        boolean result = arrayList1.contains("Мария"); // => Метод contains()  проверяет, есть ли в списке искомый объект.
        System.out.println(result); // => true.
    }
}
