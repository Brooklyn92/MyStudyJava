package lesson16;

public class Test9 {
    public static void main(String[] args) {
        String s1 = "привет";
        System.out.println(s1.isBlank());   // isBlank-метод возвращает результат запроса,является ли эта строка «пустой»,
                                            // не содержащих никаких символов,кроме пробелов,табуляций и прочих невидимых символов.

        String s2 = "    ";
        System.out.println(s2.isBlank());

        String s3 = "";
        System.out.println(s3.isEmpty());


        String s4 = "      hello        ";
        System.out.println(s4.trim()); // метод удаляет пробелы в начале и в конце

        String s5 = "      hello        ";
        System.out.println(s5.stripLeading()); // метод удаляет пробелы в начале, но не убираются в конце

        String s6 = "      hello        ";
        System.out.println(s6.stripTrailing()); // метод удаляет пробелы в конце, но не убираются в начале
    }

}
