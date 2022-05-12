package lesson19_Varargs_CommandLine_and_ForeaLoop;

public class VarargsTest1 {
    public static void main(String[] args) {
        sum(6,4,5);
    }
    static void sum(int ... a) {
        int sum=0;
        for (int i = 0; i<a.length; i++) {
            sum+=a[i];
        }
        System.out.println(sum);
    }
}
