package udemy.lesson16_String;

public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("Privet");

        int a = s1.length(); // длина объекта
        System.out.println(a);

        char c1 = s1.charAt(3); // показывает на каком индексе какой символ находится
        System.out.println(c1);

        int i1 = s1.indexOf('t'); // проверяет, какой индекс имеет тот или иной символ  или символы
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        String s2 = new String("abcffjfabcd");

        int i3 = s2.indexOf('a', 6); // ищем первое совпадение искомого символа, начиная с n-ого индекса.
        System.out.println(i3);

        boolean b1 = s2.startsWith("abc"); // проверяется, с какого символа или символов начинается строка
        System.out.println(b1);

        boolean b2 = s2.startsWith("abc",5); // проверяется, с какого символа или символов начинается строка + c какого индекса начать поиск
        System.out.println(b2);

        boolean b3 = s2.endsWith("abc"); // проверяется, с какого символа или символов заканчивается строка
        System.out.println(b3);

    }


}
