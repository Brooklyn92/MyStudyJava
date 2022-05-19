package lesson20_arrayList;

import java.util.*;

public class HomeWork20 {
    public static void main(String[] args) {
        abc("y", "a", "f","a");
    }

    public static void abc(String...s) {
        List<String> wordList = Arrays.asList(s);
        for (String w: wordList) {
        }
        Collections.sort(wordList);
        System.out.println(wordList);

    }

}
