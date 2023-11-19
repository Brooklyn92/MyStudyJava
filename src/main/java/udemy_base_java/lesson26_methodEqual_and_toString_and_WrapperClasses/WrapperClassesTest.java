package udemy_base_java.lesson26_methodEqual_and_toString_and_WrapperClasses;

import java.util.ArrayList;

public class WrapperClassesTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        //==метод parse===
        String s1 = "50";
        int i1 = Integer.parseInt(s1); // переменная s1 теперь имеет тип данных int
        System.out.println(i1); // => 50
        String s2 = "4.30";
        double d1 = Double.parseDouble(s2);
        System.out.println(d1);

        Integer i3 = Integer.valueOf(s1);
        System.out.println(i3);
    }
}
