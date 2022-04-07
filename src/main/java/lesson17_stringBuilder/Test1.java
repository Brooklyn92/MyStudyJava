package lesson17_stringBuilder;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Хорошего дня");
        StringBuilder sb3 = new StringBuilder(50); // Capacity - вместимость символов в данный объект. Первоначальная вместимость capacity  по умолчанию 16 символов.
        StringBuilder sb4 = new StringBuilder(sb3); // присваивает тоже значение, что и в объекте sb3

        System.out.println(sb2.length());
        System.out.println(sb2.charAt(4));
        System.out.println(sb2.indexOf("г"));
        String s  = sb2.substring(5); // выводится string с 5 символа
        System.out.println(s);
        String s2 = sb2.substring(5,8); //выводится string с 5 символа и заканчивает 8 символом.
        System.out.println(s2);
        System.out.println(sb2.subSequence(5,8)); // работает аналогично методу substring
        System.out.println(sb2.append(22)); //Хорошего дня22. добавляет уже к существующему стрингу заданное значание. Новый объект не пересоздаётся, а добавляется к существующему.
        System.out.println(sb2.append(true)); //Хорошего дня22true
        System.out.println(sb2.append(sb2)); //Хорошего дня22trueХорошего дня22true
    }
}
