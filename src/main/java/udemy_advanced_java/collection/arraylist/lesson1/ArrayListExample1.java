package udemy_advanced_java.collection.arraylist.lesson1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Maria");
        System.out.println(arrayList1); // => [Zaur, Ivan, Maria]

        List<String> arrayList2 = new ArrayList<>(arrayList1); // => помещение элементов arrayList1 в arrayList2
        System.out.println(arrayList2); // => [Zaur, Ivan, Maria]
    }
}
