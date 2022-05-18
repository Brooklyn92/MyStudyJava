package lesson20_arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest6 {
    public static void main(String[] args) {
        String s1 = "A";
        String s2 = "B";
        String s3 = "C";
        String s4 = "D";
        ArrayList<String> list = new ArrayList<>();
        list.add(s3);
        list.add(s1);
        list.add(s4);
        list.add(s2);
        System.out.println(list);// [C, A, D, B]
        Collections.sort(list);//сортирует ArrayList
        System.out.println(list); // [A, B, C, D]
    }

}
