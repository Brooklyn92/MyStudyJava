package udemy_base_java.lesson20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest9 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("1");
        all.add("2");
        all.add("3");
        all.add("4");
        all.add("5");

        List <String> list = List.of("один","два", "три"); // добавление элементов напрямую в List. Видозименять этот List невозможно.
        System.out.println(list); // -> [один, два, три]

        List <String> list2 = List.copyOf(all); // копирует все элементы ArrayList в list2. Видозименять этот List невозможно.
        System.out.println(list2); // -> [1, 2, 3, 4, 5]
    }
}
