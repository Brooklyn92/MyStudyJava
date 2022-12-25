package lesson30_lambda;

import java.util.ArrayList;

public class LambdaAndKeywordVarExample3 {
    public static void main(String[] args) {
        //example1
        var t1 = new TestInterfaceType();

        //example2
        var i = 10;

        //example3
        var w = 1.5f;

        //example4
        var array  = new String[]{"a", "b"};

        //example5
        var result = abc();

        //example6
        Object obj = "Привет";
        var obj2 = obj; // => объект obj2 присваивает значение объекта obj.

        //example7
        ArrayList<String> a1 = new ArrayList<>();
        for (var s:a1) {
            System.out.println(s);
        }


    }
    static double abc() {
        return 3.14;
    }
}


class TestInterfaceType {

}


