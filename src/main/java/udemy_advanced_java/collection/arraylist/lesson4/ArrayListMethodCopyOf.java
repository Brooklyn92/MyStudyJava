package udemy_advanced_java.collection.arraylist.lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodCopyOf {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Николай");
        System.out.println(arrayList1); // => [Заур, Иван, Мария, Николай]

        List<String> arrayList2 = List.copyOf(arrayList1); // => Метод копирует все элементы arrayList1 в arrayList2. Коллекция arrayList2 не изменяемая.
        System.out.println(arrayList2); // => [Заур, Иван, Мария, Николай]

    }
}
