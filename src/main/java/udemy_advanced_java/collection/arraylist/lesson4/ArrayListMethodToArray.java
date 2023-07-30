package udemy_advanced_java.collection.arraylist.lesson4;

import java.util.ArrayList;

public class ArrayListMethodToArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Заур");
        arrayList1.add("Иван");
        arrayList1.add("Мария");
        arrayList1.add("Николай");
        arrayList1.add("Елена");
        System.out.println(arrayList1); // => [Заур, Иван, Мария, Николай]

        Object[] arrayObject = arrayList1.toArray();

        String[] arrayString = arrayList1.toArray(new String[5]);
        for (String s: arrayString) {
            System.out.print(" " + s); // => Заур Иван Мария Николай Елена
        }

    }
}
