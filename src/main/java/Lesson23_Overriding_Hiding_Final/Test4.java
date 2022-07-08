package Lesson23_Overriding_Hiding_Final;

public class Test4 {
    void abc(Animal a) {
        System.out.println("A");
    }

    void abc(Mouse m) {
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 test4 = new Test4();
        Animal an  = new Mouse();
        //test4.abc(an); // -> A - переменная an типа данных Animal, an в данном случае не будут ссылать на объект Mouse
        an.getName(); // -> Mouse - переменная an типа данных Animal в данном случае будет ссылать на объект Mouse

    }
}

class Animal {
    void getName() {
        System.out.println("Animal");
    }
}

class Mouse extends Animal {
    void getName() {
        System.out.println("Mouse");
    }
}
