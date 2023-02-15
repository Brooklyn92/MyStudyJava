package udemy.lesson17_stringBuilder;

public class hw17 {
    public static void main(String[] args) {
        StringBuilder stringBuilder1 = new StringBuilder("Привет");
        StringBuilder stringBuilder2 = new StringBuilder("привет");
        System.out.println(ravenctvo(stringBuilder1, stringBuilder2));

    }


    public static boolean ravenctvo(StringBuilder sb1, StringBuilder sb2) {

        return sb1.toString().equals(sb2.toString());


    }
}
