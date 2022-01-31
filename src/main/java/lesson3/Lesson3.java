package lesson3;

public class Lesson3 {
    public static void main(String[] args) {
       boolean x = true;
       boolean y = false;
       boolean z = true;
       boolean result = x && y && z; // и
        System.out.println(result);
        boolean result2 = x || y || z; // или
        System.out.println(result2);

        int a=5;
        int res = a-- - --a + ++a + a++ +a;
        System.out.println(res);
    }
}
