package udemy.lesson16_String;

public class Test7 {
    public static void main(String[] args) {
        String s1 = "Hello world";
        String s2 = "Урааа!!";
        String s3 = s1.concat(s2).trim().replace("Урааа!!", "УРА!!").substring(6,10);
        System.out.println(s1.substring(s1.indexOf('w')));// стринга "Hello world" выводится с буквы w, т.е. на экран выводится слово "world".
        //System.out.println(s3);
        /*
            1. contact - соединяет две строки
            2. trim - убирает пробелы слева и справа
            3. replace - меняет одно значение в парметрах метода на другое
         */
    }
}
