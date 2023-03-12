package udemy_advanced_java.generics.lesson1;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Привет", 20);
        System.out.println(pair.getValue1() + "," + pair.getValue2());
    }
}
