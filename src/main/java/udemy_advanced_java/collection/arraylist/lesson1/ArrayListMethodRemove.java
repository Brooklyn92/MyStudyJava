package udemy_advanced_java.collection.arraylist.lesson1;

import java.util.ArrayList;

public class ArrayListMethodRemove {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Светлана");
        arrayList1.add("Анастасия");
        System.out.println(arrayList1); // => [Заур, Иван, Мария, Светлана, Анастасия]

        arrayList1.remove(0); // => метод remove удаляет значение в ArrayList по необходимому индексу.
        System.out.println(arrayList1); // => [Иван, Мария, Светлана, Анастасия]

        arrayList1.remove("Мария"); // => так же можно удалять по необходимому значению в ArrayList
        System.out.println(arrayList1); // => [Иван, Светлана, Анастасия]
    }
}
