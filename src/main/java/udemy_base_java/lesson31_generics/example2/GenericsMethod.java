package udemy_base_java.lesson31_generics.example2;

import java.util.ArrayList;

public class GenericsMethod {
    public static <T> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }


}
