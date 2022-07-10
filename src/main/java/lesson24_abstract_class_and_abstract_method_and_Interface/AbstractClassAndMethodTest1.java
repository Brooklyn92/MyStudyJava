package lesson24_abstract_class_and_abstract_method_and_Interface;

public class AbstractClassAndMethodTest1 {
    public static void main(String[] args) {
        Kvadrat kvadrat = new Kvadrat();
        kvadrat.perimetr();

    }
}

abstract class Figura {
    int counStoron = 0;
    abstract void perimetr();
    abstract void ploshad();
    void showInfo() {
        System.out.println("Это фигура");
    }
}

class Kvadrat extends Figura {
    int storona = 10;
    int counStoron = 4;
    public void perimetr() {
        System.out.println(4 * storona);
    }

    public void ploshad() {
        System.out.println(storona*storona);
    }
}

class Pryamougolnik extends Figura {
    int storona1 = 8;
    int storona2 = 5;
    int counStoron = 4;
    public void perimetr() {
        System.out.println(2*(storona1+storona2));
    }

    public void ploshad() {
        System.out.println(storona1*storona2);
    }
}

abstract class ChetirexUgolnik extends Figura {    // помечаем класс как abstract, что бы не реализовывать абстрактные методы в parent классе.
    void def() {
        System.out.println("Это четырёхгольник");
    }
}