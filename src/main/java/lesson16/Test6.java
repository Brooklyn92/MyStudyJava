package lesson16;

import java.util.Locale;

public class Test6 {
    public static void main(String[] args) {
        String s = "ПРИВЕТ";
        String s1 = s.toLowerCase(Locale.ROOT); // метод заменяет все буквы на маленькие.
        System.out.println(s1);
    }
}
