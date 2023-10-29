package udemy_advanced_java.collection.arraylist.lesson3;

import java.util.List;

public class ArrayListMethodListOf {
    public static void main(String[] args) {
        List<Integer> list = List.of(3,8,13);
        System.out.println(list); // => [3, 8, 13]

        list.add(100); // => UnsupportedOperationException, ImmutableCollections. Коллекция list не изменяемая.
    }
}
