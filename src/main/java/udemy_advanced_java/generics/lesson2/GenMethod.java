package udemy_advanced_java.generics.lesson2;

import java.util.ArrayList;

public class GenMethod {

    // T - это return type метода, а <T> обозначает, что метод и мы используем
    // generics в данном методе
    public static <T> T getSecondElement(ArrayList<T> a1) {
        return a1.get(1);
    }
}
