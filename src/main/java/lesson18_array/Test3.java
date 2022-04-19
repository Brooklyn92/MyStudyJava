package lesson18_array;

import java.util.Arrays;

public class Test3 {
    public static void main(String[] args) {

        int array1[] = {1,9,3,-8,0,5,4,1};

        for (int i = 0; i<array1.length; i++) {
            System.out.print(array1[i] + " "); // 1 9 3 -8 0 5 4 1
        }
        System.out.println();

        Arrays.sort(array1); // сортировка массива от меньшего к большему

        for (int i = 0; i<array1.length; i++) {
            System.out.print(array1[i] + " "); // -8 0 1 1 3 4 5 9
        }

        System.out.println();
        int index1 = Arrays.binarySearch(array1, -8); // выполняет поиск определённого значения в определённом массиве
        System.out.println(index1);
    }
}
