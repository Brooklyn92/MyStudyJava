package lesson13;

public class Test2 {
    public static void main(String[] args) {
        switch ("суббота") {
            case "понедельник":
            case "вторник":
            case "среда":
            case "четверг":
            case "пятница":
                System.out.println("Работа до 18:00");
                break;
            case "суббота":
                System.out.println("Работа до 16:00");
                break;
            case "воскресенье":
                System.out.println("Работа до 14:00");
        }
    }
}
