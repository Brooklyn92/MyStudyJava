package lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> list = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("hello");
        StringBuilder sb2 = new StringBuilder("ok");
        StringBuilder sb3 = new StringBuilder("privet");
        list.add(sb1);
        list.add(sb2);
        list.add(sb3);
        for (int i=0; i<list.size(); i++) {
            list.get(i).append("!!!"); // изменение элементов ArrayList без его методов.
        }
        for (StringBuilder sb:list) {
            System.out.println(sb+ " ");
        }
        //list.remove(2); //удаление элемента по индексу
        //list.remove(sb1); // удаление элемента по объекту

        System.out.println();
        for (StringBuilder sb:list) {
            System.out.println(sb+ " ");
        }
    }
}
