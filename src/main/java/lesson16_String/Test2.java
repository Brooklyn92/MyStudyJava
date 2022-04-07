package lesson16_String;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("abcffjfabcd"); // выводит кусок стринга начиная с 3 индекса
        String s10 = s1.substring(3);
        System.out.println(s10);
        // не один метод вызванный на объекте String его самого не меняет, потому что String является immutable,
        // поэтому нужно новый результат присваивать новому объекту класса String
        String s11 = s1.substring(3,7); // выводит выводит кусок стринга начиная с 3 индекса и заканчивая 7, 7 индекс не не включается в результат,
                                        // поэтому выводится результат с 3 по 6 индекс
        System.out.println(s11);

        String s12 = s11.trim();// убирает пробелы слево и справо
        System.out.println(s12);

        String s13 = s1.substring(3,11); // что бы вывести последний элемент, нужно прибавить к максимальному значению индексов стринга ещё один индекс
                                        // в данном случае в данном стринге 10 индексов, что бы вывести последнюю букву "d" необходимо прописать значение 11.
        System.out.println(s13);

        String s2 = new String("Привет");
        String s14 = s2.replace('П', 'п'); // заменяет симсволы или символы на новые значения.
        System.out.println(s14);

        String s15 = s2.replace("вет", "вивка"); // заменяет симсволы или символы на новые значения.
        System.out.println(s15);

    }
}
