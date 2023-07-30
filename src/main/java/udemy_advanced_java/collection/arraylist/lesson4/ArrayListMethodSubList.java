package udemy_advanced_java.collection.arraylist.lesson4;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethodSubList {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Николай");
        arrayList1.add("Елена");
        System.out.println("ArrayList = " + arrayList1); // => [Заур, Иван, Мария, Николай]

        List<String> myList = arrayList1.subList(1,4); // => метод получает фрагмент массива на основе arrayList1. Первый индекс включительный, а второй исключительный, т.е. он в список входить не будет.
        System.out.println("SubList = " + myList); // => [Иван, Мария, Николай]

        myList.add("Федор");
        System.out.println("SubList = " + myList); // => Иван, Мария, Николай, Федор]
        System.out.println("ArrayList = " + arrayList1); // => [Заур, Иван, Мария, Николай, Федор, Елена]. Элемент Федор добавился потому что myList является представлением arrayList1.

        arrayList1.add("Светлана");
        System.out.println("ArrayList = " + arrayList1); // => ConcurrentModificationException. Взаимодействие с arrayList1 может происходить только с myList
        System.out.println("SubList = " + myList); // => ConcurrentModificationException. Взаимодействие с arrayList1 может происходить только с myList
    }
}
