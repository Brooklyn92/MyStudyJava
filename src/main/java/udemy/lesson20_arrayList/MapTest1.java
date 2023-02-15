package udemy.lesson20_arrayList;

import java.util.HashMap;
import java.util.Map;

public class MapTest1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "Ivanov Mihail");
        map.put(778, "Pupkin Aleksey");
        map.put(779, "Petrov Ivan");
        map.put(780, "Mijakov Aleksandr");
        map.put(779, "Robetro Carlos"); // ->  "Petrov Ivan" перезаписывается на "Robetro Carlos", потому что они имеют один и тот же ключ
        map.put(781, "Petrov Ivan");
        System.out.println("map " + map);
        map.remove(779); // -> Удаление значение из списка map
        System.out.println("map " + map);
    }
}
