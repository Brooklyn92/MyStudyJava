package lesson25_polimorfizm;

public class NumericPromotionTest {
    public static void main(String[] args) {
        int i = 5;
        long l = 10;
        System.out.println(i+l); // -> i будет преобразованно автоматически в тип данных long
        float f = 22.11f;
        System.out.println(f+i); // -> i будет преобразовано автоматически в тип данных float
        byte b = 3;
        char c = 3;
        short s = 3;
        System.out.println(b+c+s);// -> i b,c и s будут автоматически преобразованный в int
    }
}
