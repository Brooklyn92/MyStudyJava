package udemy_base_java.lesson30_lambda;

public class LambdaExample2 {

    public static void main(String[] args) {
        Operationable operationable;
        operationable = (x, y) -> x+y;
        Operationable operationable2 = (x, y) -> x-y;
        int result = operationable.calculate(10,20);
        System.out.println(operationable2.calculate(50, 30));
        System.out.println(result);
    }
}
