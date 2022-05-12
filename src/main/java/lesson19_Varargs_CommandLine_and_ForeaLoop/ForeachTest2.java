package lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,6};
        int sum = 0;
        for (int arrays: array) {
            sum = sum + arrays;
        }
        System.out.print(sum);
    }
}
