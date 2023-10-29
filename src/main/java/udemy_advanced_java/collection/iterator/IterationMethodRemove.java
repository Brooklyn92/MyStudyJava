package udemy_advanced_java.collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationMethodRemove {
    public static void main(String[] args) {
            ArrayList<String> arrayList1 = new ArrayList<>();
            arrayList1.add("Заур");
            arrayList1.add("Иван");
            arrayList1.add("Мария");
            arrayList1.add("Николай");
            arrayList1.add("Елена");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove(); // => Метод удаляет все элементы arrayList1. Удалить элементы массива без вызова перед ним метода next() невозможно.
        }
        System.out.println(arrayList1); // => []
    }
}
