package udemy_advanced_java.collection.hashmap.lesson3;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample3 {
    public static void main(String[] args) {
        /**
         * initialCapacity => начальный размер массива
         * loadFactor => коэффициент того, насколько массив должен быть заполнен, после чего его размер будет увеличен вдвое. Например 16 * 0.75 = 12. При заполнении массива 12 элементами,
         * размер массива будет равен 32.
         */
        Map<Integer, String> map = new HashMap<>(16, 0.75f);
    }
}
