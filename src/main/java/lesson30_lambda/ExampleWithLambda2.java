package lesson30_lambda;

public class ExampleWithLambda2 {
    static void def(ExampleWithLambdaInterface2 e1) {
        System.out.println(e1.abc("Привет"));
    }

    public static void main(String[] args) {
        def(x -> x.length()); // => 6
        def(x -> { x="Пока"; return  x.length();}); // => переопределили парметр х с "Привет" на  "Пока" и ответом пришёл int cо значением = 4
    }
}
