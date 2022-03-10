package lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "ПРИВЕТ";
        String s1 = s.toLowerCase(Locale.ROOT); // метод заменяет все буквы на маленькие.
        System.out.println(s1);
        String s2 = "Привет";
        String s3 = s2.toUpperCase(Locale.ROOT); // метод заменяет все буквы на заглавные
        System.out.println(s3);

        boolean b = s.contains("е");// проверяет,содердит ли символ или символы в искомой строке
        System.out.println(b);
    }
}
