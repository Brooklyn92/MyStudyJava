package lesson17_stringBuilder;

import lesson16_String.Car;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Хорошего дня");
        StringBuilder sb3 = new StringBuilder(50); // Capacity - вместимость символов в данный объект. Первоначальная вместимость capacity  по умолчанию 16 символов.
        StringBuilder sb4 = new StringBuilder(sb3); // присваивает тоже значение, что и в объекте sb3
        StringBuilder sb5= new StringBuilder("Hello world");

//      System.out.println(sb2.length()); //12
//      System.out.println(sb2.charAt(4)); //ш
//      System.out.println(sb2.indexOf("г")); //6
//      System.out.println(sb2.substring(5)); // выводится string с 5 символа: "его дня"
//      String s2 = sb2.substring(5,8); //выводится string с 5 символа и заканчивает 8 символом.
//      System.out.println(s2);
//      System.out.println(sb2.subSequence(5,8)); // работает аналогично методу substring
//      System.out.println(sb2.append(22)); //Хорошего дня22. добавляет уже к существующему стрингу заданное значание. Новый объект не пересоздаётся, а добавляется к существующему.
//      System.out.println(sb2.append(true)); //Хорошего дня22true
//      System.out.println(sb2.append(sb2)); //Хорошего дня22trueХорошего дня22true
//      System.out.println(sb2.append(new Car("Red","v3"))); //Хорошего дня22trueХорошего дня22truelesson16_String.Car@7d6f77cc

        System.out.println(sb2.insert(4,"OK")); // Вставляет значение в существующий объект. С заданного индекса (4) вставлять  значение (OK): ХороOKшего дня
        //System.out.println(sb5.delete(0,4));//удаляет символы, второй параметр не включается в удаление. Т.е. в данном примере удаляется с 0 по 3 индекс.
        //System.out.println(sb5.deleteCharAt(6)); // удаляет один символ по индексу: "Hello orld"
        //System.out.println(sb5.reverse()); //Стринга будет читаться справа налево: dlrow olleH
        System.out.println(sb5.replace(0,5,"Привет")); //Заменяет значение стринга,в параметрах указывается начальный индекс,
                                                                    // конченый индекс и значение,на которое будет изменение: Привет world.

        System.out.println(sb5.capacity());//показывает вместимость символов в данный объект. Считается так:если стринга не пустая, то он к данной длине массива прибаляет 16


    }
}
