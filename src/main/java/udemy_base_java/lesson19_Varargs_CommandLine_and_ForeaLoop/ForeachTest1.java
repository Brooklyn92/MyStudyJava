package udemy_base_java.lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest1 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        for (int arrays: array) {
            System.out.print(arrays);
        }
    }
}
