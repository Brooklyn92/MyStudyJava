package udemy.lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest5 {
    public static void main(String[] args) {
        int[] array = new int[]{0,6,4,1};

        for (int arrays: array) {
            arrays = 3;
            System.out.println(arrays);
        }

    }
}
