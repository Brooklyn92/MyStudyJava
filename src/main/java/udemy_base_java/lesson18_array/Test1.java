package udemy_base_java.lesson18_array;

public class Test1 {
    public static void main(String[] args) {
        //=============Определение массивов================
        int[] array1; //null
        String[] array2; //null
        double[][] array3; //null


        int[][] array10 = new int[3][2];

        array1 = new int[8]; // длина 8 элемента
        array2= new String[3]; // длина 3 элемента
        array3 = new double[4][2]; // содержит 4 одномерных массива длины которых будет по два элемента

        //=========Статическая инициализация===================
        array2[0] = "привет";
        array2[1] = "пока";
        array2[2] = "ок";

        array3[0][0] = 3.14;
        array3[2][1] = 3.14;

        double[] array5 = new double[2];
        array5[0] = 2.5;
        array5[1] = 3.5;

        array3[1] = array5; // присвоение 1 элементу двумерного массива значения одномерного массива
        //System.out.println(array3[1][0]);

        double array7[] = new double[2];
        array7 = array5;
        System.out.println(array7[0]);


    }
}
