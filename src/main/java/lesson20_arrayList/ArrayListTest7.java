package lesson20_arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest7 {
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
        Iterator<String> it = list.iterator(); // Iterator перебирает все элементы в коллекции
        while (it.hasNext()) {
           System.out.println(it.next());
        }
    }
}
