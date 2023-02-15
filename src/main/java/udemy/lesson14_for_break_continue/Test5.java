package udemy.lesson14_for_break_continue;

public class Test5 {
    public static void main(String[] args) {
        for (int i=1; i<=10;i++) {
            if (i==7){ // когда в цикле i будет равняться 7, то цикл for прекращает выполнятся
                break;
            }
            System.out.println(i);
        }
        System.out.println("==================================");

        for (int i=1; i<=10;i++) {
            if (i==7){ //
                continue; // когда в цикле i будет равняться 7, то цикл for заканчивает не целый цикл,
                          // а заканчивает текущее повторение и переходит на следующий этап циакл, т.е. число 7 будет пропущен, но цикл продолжит свою работы
            }
            System.out.println(i);
        }
    }
}
