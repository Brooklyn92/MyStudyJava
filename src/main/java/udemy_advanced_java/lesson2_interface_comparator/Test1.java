package udemy_advanced_java.lesson2_interface_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Aleksandr");
        list.add("Maria");
        list.add("Dmitriy");
        System.out.println("Перед сортировкой");
        System.out.println(list); // => значения выводятся в такой очередности, как они написаны: [Aleksandr, Maria, Dmitriy]
        Collections.sort(list);
        System.out.println("После сортировки");
        System.out.println(list); // => значения сортируются по начальной букве алфавита: [Aleksandr, Dmitriy, Maria]
    }
}
