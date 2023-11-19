package udemy_base_java.lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest6 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for (int i = 0; i<array.length; i++) {
            array[i] = i*10;
            System.out.print(array[i] + ", ");
        }
    }
}
