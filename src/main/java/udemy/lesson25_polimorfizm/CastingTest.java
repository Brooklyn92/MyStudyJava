package udemy.lesson25_polimorfizm;

public class CastingTest {
    public static void main(String[] args) {
        String [] array1 = {"Ok", "By"};
        Object [] array2 = array1; // -> casting происходит автоматически, т.к. любой String это Object
        String [] array3 = (String[]) array2; // -> не любой массив типа Object, это String, поэтому нужно производить casting
        //array3[0] = new StringBuilder("ok") // -> произвести casting нет возможности
        array2[0] = new StringBuilder("ok");  // -> Execution
    }
}
