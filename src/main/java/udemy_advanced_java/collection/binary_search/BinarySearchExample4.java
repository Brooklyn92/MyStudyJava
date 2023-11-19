package udemy_advanced_java.collection.binary_search;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySearchExample4 {
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
        Collections.sort(arrayList); // => сортируем список arrayList по возрастанию
        System.out.println(arrayList); // => [-30, -8, -3, 0, 1, 5, 8, 10, 12, 19, 150]

        Collections.reverse(arrayList); // => ревёрсим ранее отсортированный список arrayList.
        System.out.println(arrayList); // => [150, 19, 12, 10, 8, 5, 1, 0, -3, -8, -30]

        Collections.shuffle(arrayList); // => перемешивает ранее отсортированный список arrayList.
        System.out.println(arrayList); // => [0, -8, -3, 1, 5, 150, 8, -30, 19, 12, 10]

    }
}
