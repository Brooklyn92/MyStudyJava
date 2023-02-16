package udemy.lesson31_generics.example2;

import java.util.ArrayList;

public class Example2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(10);
        arrayList.add(11);
        arrayList.add(21);
        int a = GenericsMethod.getSecondElement(arrayList);
        System.out.println(a);

    }
}
