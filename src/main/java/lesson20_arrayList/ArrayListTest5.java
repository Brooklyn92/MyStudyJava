package lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest5 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        ArrayList<StringBuilder> list1 = new ArrayList<>();
        list1.add(sb1);
        list1.add(sb2);
        list1.add(sb3);
        ArrayList<StringBuilder> list2 = (ArrayList<StringBuilder>) list1.clone(); // клонирует все элементы из list1 в новый ArrayList list2
        System.out.println(list1.get(0) == list2.get(0));
    }
}
