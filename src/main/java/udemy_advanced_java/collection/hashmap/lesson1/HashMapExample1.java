package udemy_advanced_java.collection.hashmap.lesson1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000, "Заур Трегулов");
        map1.put(3568, "Иван Иванов");
        map1.put(6578, "Мария Сидорова");
        map1.put(15879, "Николая Петров");
        map1.put(1000, "Олег Иванов"); // => Данная вставка перезапишит предыдущую вставку (1000, "Заур Трегулов")
        map1.put(null, "Сергей Петров");
        map1.put(85214, null);
        map1.putIfAbsent(1000, "Максим Максимов"); // Данная запись не добавится в HashMap, т.к. уже существует запись с данным ключом.
        System.out.println(map1);
//        System.out.println(map1.get(1000)); // => Олег Иванов
        map1.remove(15879); // => удаляет запись (15879, "Николая Петров") из HashMap
        System.out.println(map1);
        System.out.println(map1.containsValue("Иван Иванов")); // => true. Метод проверяет, есть ли искомое значение в HashMap map1
        System.out.println(map1.containsKey(3568)); // => true. Метод проверяет, есть ли искомый ключ в HashMap map1
        System.out.println(map1.keySet()); // => возвращает множество всех ключей. Результат будет [3568, null, 6578, 1000, 85214]
        System.out.println(map1.values()); // => [Иван Иванов, Сергей Петров, Мария Сидорова, Олег Иванов, null]. Возвращает множество всех значений.
        System.out.println(map1.entrySet()); // => [3568=Иван Иванов, null=Сергей Петров, 6578=Мария Сидорова, 1000=Олег Иванов, 85214=null]
    }
}
