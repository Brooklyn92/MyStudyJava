package lesson20_arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Привет");
        Car car = new Car();
        list.add(car);
        list.add(new StringBuilder("ok"));
        ArrayList<String> list2 = new ArrayList<>(); // ArrayList будет содержать в себе только тип данных String
        list2.add("poka");
        ArrayList<StringBuilder> list3 = new ArrayList<>();
        List <String> list4 = new ArrayList<>(); // так же ArrayList можно создавать через интерфейс List
        ArrayList list5 = new ArrayList<>(30);// в скобках можно указать размерность ArrayList по умолчанию.
        ArrayList<String> list6 = new ArrayList<>(list5);
        System.out.println(list5 == list6); // false

    }
}

class Car {

}
