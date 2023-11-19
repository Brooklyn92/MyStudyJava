//package udemy.lesson24_abstract_class_and_abstract_method_and_Interface.example1.hw;
//
//public class HW24 {
//    public static void main(String[] args) {
//        Mechenosec m1 = new Mechenosec("Кузя");
//        m1.eat();
//        m1.sleep();
//        m1.swim();
//
//        Speakable s1 = new Pingvin("Вася");
//        s1.speak();
//
//        Animal a1 = new Lev("Боря");
//        a1.eat();
//        a1.sleep();
//
//        Mammal mammal = new Lev("Симба");
//        mammal.speak();
//        mammal.eat();
//        mammal.sleep();
//        mammal.run();
//    }
//}
//
//abstract class Animal {
//String name;
//public Animal(String name) {
//    this.name = name;
//    }
//    abstract void eat();
//    abstract void sleep();
//}
//
//abstract class Fish extends Animal {
//    public Fish(String name) {
//        super(name);
//    }
//
//    void sleep() {
//        System.out.println("Всегда интересно наблюдать, как спят рыбы");
//    }
//    abstract void swim();
//
//}
//
//abstract class Bird extends Animal implements Speakable {
//
//    public Bird(String name) {
//        super(name);
//    }
//    abstract void fly();
//    public void speak() {
//        System.out.println(name + " sing");
//    }
//}
//
//abstract class Mammal extends Animal implements Speakable {
//
//    public Mammal(String name) {
//        super(name);
//    }
//    abstract void run();
//}
//
//class Mechenosec extends Fish {
//    public Mechenosec(String name) {
//        super(name);
//    }
//    void eat() {
//        System.out.println("Меченосец не хищная рыба и она есть обычный рыбий корм");
//    }
//
//
//    void swim() {
//        System.out.println("Меченосец красивая рыба, которая умеет быстро плавать");
//    }
//}
//
//class Pingvin extends Bird {
//
//    public Pingvin(String name) {
//        super(name);
//    }
//
//    public void eat() {
//        System.out.println("Пингвин любит есть рыбу");
//    }
//    public void sleep() {
//        System.out.println("Пингвины спят прижавшись друг к другу");
//    }
//    public void fly() {
//        System.out.println("Пингвины не умеют летать");
//    }
//    public void speak() {
//        System.out.println("Пингвины не умеют петь как соловьи");
//    }
//}
//
//class Lev extends Mammal {
//
//    public Lev(String name) {
//        super(name);
//    }
//
//    public void eat() {
//        System.out.println("Лев как и любой хищник любит мясо");
//    }
//    public void sleep() {
//        System.out.println("Большую часть дня, лев спит");
//    }
//    public void run() {
//        System.out.println("Лев - это не самая быстрая кошка");
//    }
//}