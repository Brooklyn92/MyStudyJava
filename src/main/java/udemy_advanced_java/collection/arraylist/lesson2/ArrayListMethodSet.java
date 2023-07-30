package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodSet {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        System.out.println(arrayList1); // => [Заур, Иван, Мария]

        arrayList1.set(1, "Сергей"); // метод set() может изменить значение ArrayList на необходимом индексе.
        System.out.println(arrayList1); // => [Заур, Сергей, Мария]
    }
}
