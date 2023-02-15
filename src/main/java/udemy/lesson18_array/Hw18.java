package udemy.lesson18_array;

import java.util.Arrays;

public class Hw18 {
    public static void main(String[] args) {
        int[] array1 = {-1,11,22,34,-9,45,56,67,79,8,44,54};
        sort(array1);
    }


    public static void sort(int[]array) {
        for (int i =0; i<array.length; i++) {
            Arrays.sort(array);
            System.out.println(array[i]);
        }


    }
}
