package udemy_advanced_java.collection.binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(-3);
        arrayList.add(8);
        arrayList.add(12);
        arrayList.add(-8);
        arrayList.add(0);
        arrayList.add(5);
        arrayList.add(10);
        arrayList.add(1);
        arrayList.add(150);
        arrayList.add(-30);
        arrayList.add(19);
//        int index1 = Collections.binarySearch(arrayList, 12);
//        System.out.println(index1); // => -9. Отрицательного индекса быть не может, поэтому это означает, что элемент не найден. Необходимо отсортировать arrayList по возрастанию.

        Collections.sort(arrayList); // => сортируем список arrayList по возрастанию
        int index1 = Collections.binarySearch(arrayList, 12);
        System.out.println(index1); // => 8. После сортировки arrayList индекс определился правильно.
    }
}
