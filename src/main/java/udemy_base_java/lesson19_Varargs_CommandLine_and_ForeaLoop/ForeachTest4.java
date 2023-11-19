package udemy_base_java.lesson19_Varargs_CommandLine_and_ForeaLoop;

public class ForeachTest4 {
    public static void main(String[] args) {
        int i = 0;
        int[][] array = {{3,7,8},{4,5},{9,4,4,6,3}};
        for (int[] a1:array) {
            for (int a:a1){
                System.out.print(a+ " ");
            }
        }

    }
}
