package udemy_advanced_java.streams.lesson6.example1;

import java.util.Arrays;

public class MethodChaining {
    public static void main(String[] args) {
        int[] array = {3,8,1,5,9,12,4,21,81,7,18};

        int result  = Arrays.stream(array).filter(e -> e%2==1)
                .map(e -> { if (e%3==0) {e=e/3;} return e;})
                .reduce((a,e) -> a+e).getAsInt();
        System.out.println(result); // => 51

        //Проходят фильтрацию по первому условию: 3,1,5,9,21,81,7
        // Далее делим отфилтрованные числа на 3, которые делятся без остататка: 1,1,5,3,7,27,7
    }
}