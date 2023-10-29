package udemy_advanced_java.collection.arraylist.lesson3;

import java.util.Arrays;
import java.util.List;

public class ArrayListMethodAsList {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list); // => [A, B, C, D]. Длина list будет зарнее определена длинной array и изменяться длина list уже не сможет.
    }
}
