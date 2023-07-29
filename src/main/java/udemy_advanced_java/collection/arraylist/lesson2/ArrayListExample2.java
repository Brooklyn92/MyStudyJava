package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Мария");
        for(String s : arrayList1) {
            System.out.print(s + ", "); // => Zaur, Ivan, Maria.
        }
        System.out.println();

        arrayList1.add(1, "Михаил"); // => Элемент Михаил можно принудительно поместить в текущую коллекцию в необходимый индекс,
                                                  // но указанный индекс не должен быть больше размера текущегно ArrayList.
        for(String s : arrayList1) {
            System.out.print(s + ", "); // => Zaur, Mihail, Ivan, Maria.
        }
        System.out.println();
        System.out.println(arrayList1.get(0)); // => Zaur

        arrayList1.set(1, "Сергей"); // метод set() может изменить значение ArrayList на необходимом индексе.
        System.out.println(arrayList1); // => [Zaur, Сергей, Ivan, Maria]

        arrayList1.remove(0); // => метод remove удалять значение ArrayList по необходимому индексу.
        System.out.println(arrayList1); // => [Сергей, Ivan, Maria]

        arrayList1.remove("Мария"); // => метод remove удалять значение ArrayList по необходимому значению.
        System.out.println(arrayList1); // => [Сергей, Иван]
    }
}
