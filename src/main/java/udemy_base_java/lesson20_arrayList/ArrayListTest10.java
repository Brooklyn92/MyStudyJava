package udemy_base_java.lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest10 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList<>();
        al1.add("1");
        al1.add("2");
        al1.add("3");
        al1.add("4");
        al1.add("5");
        for (Object s: al1) {
            System.out.println("Number " + s + " and length " + ((String)s).length());
        }
    }
}
