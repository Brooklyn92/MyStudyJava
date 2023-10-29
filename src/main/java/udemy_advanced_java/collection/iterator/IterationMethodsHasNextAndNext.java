package udemy_advanced_java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationMethodsHasNextAndNext {
    public static void main(String[] args) {
            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Заур");
            arrayList1.add("Иван");
            arrayList1.add("Мария");
            arrayList1.add("Николай");
            arrayList1.add("Елена");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) { // => метод hasNext проверяет, есть ли следующий элемент в коллекции или нет.
            System.out.println(iterator.next()); // => Заур,Иван,Мария,Николай,Елена. Метод next() возвращает элемент коллекции и перемещает указатель на следующий элемент.
        }
    }
}
