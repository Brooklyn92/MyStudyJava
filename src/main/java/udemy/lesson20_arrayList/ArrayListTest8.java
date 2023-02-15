package udemy.lesson20_arrayList;

import java.util.ArrayList;

public class ArrayListTest8 {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("1");
        all.add("2");
        all.add("3");
        all.add("4");
        all.add("5");
        System.out.println(all); // -> [1, 2, 3, 4, 5]
        //ArrayList<String> all2 = new ArrayList<>();
        //all2.add("1");
        //all2.add("2");
        //all2.add("3");
        //all2.add("9");
        //all.removeAll(all2);// удаление тех элементов all, которые есть в all2
        //System.out.println(all); //-> [4, 5].
        //boolean result = all.containsAll(all2); // containsAll проверяет, содержит ли all все элементы all2
        //System.out.println(result); // false, потому что в all2 содержится "9"
        //List<String> subList = all.subList(1,3); // импортирует элементы arrayList all в List subList. В параметрах указываются индексы начала и конца. Конечный индекс не включается в диапазон.
        //System.out.println(subList); //-> [2, 3]
        Object[] arr1 = all.toArray(); // возвращает массив типа Object
        String [] arr2 = all.toArray(new String[5]); //String [] arr2 присваивает все элементы ArrayList all
        for(String s: arr2) {
            System.out.print(s + " "); // -> 1 2 3 4 5
        }

    }
}
