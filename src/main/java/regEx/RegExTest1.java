package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExTest1 {
    public static void main(String[] args) {

        //=====Пример-1=============================================
//        Pattern pattern = Pattern.compile("а");
//        Matcher matcher = pattern.matcher("С целью безопасности Вам было отправлено сообщение на норме телефона: +79398857463");
//        while (matcher.find()) {
//            System.out.print(matcher.start() + " " + matcher.group() + " ");
//        }
//        System.out.println("");


        //=====Пример-1=============================================
//        Pattern pattern = Pattern.compile("\\+7"); // экранировать спецсимволы нужно через \\
//        Matcher matcher = pattern.matcher("С целью безопасности Вам было отправлено сообщение на норме телефона: +79398857463");
//        while (matcher.find()) {
//            System.out.println(matcher.start() + " " + matcher.group() + " ");
//        }
//        System.out.println("");

        //=====Пример-2=============================================
//        String regEx = "/(?:\\+|\\d)[\\d\\-\\(\\) ]{9,}\\d/g";
//        String test = "С целью безопасности Вам было отправлено сообщение на норме телефона: +79398857463";
//        System.out.println(test.matches(regEx));
    }
}
