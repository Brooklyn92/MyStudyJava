package udemy_advanced_java.collection.arraylist.lesson2;

import java.util.ArrayList;

public class ArrayListMethodISize {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");

        int sizeArrayList = arrayList1.size(); // => Возвращает размерность массива
        System.out.println(sizeArrayList); // => 3
    }
}
