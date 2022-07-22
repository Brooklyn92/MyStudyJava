package lesson25_polimorfizm.hw25;

public class hw25 {
    public static void main(String[] args) {
        Animal a1 = new Mechenosec("Кузя");
        Animal a2 = new Lev("Симба");
        Animal a3 = new Pingvin("Kinder");
        Fish f1 = new Mechenosec("Воин");
        Bird b1 = new Pingvin("Pingvi");
        Mammal m1 = new Lev("Шрам");
        Mechenosec mechenosec = new Mechenosec("Гроза");
        Pingvin p1 = new Pingvin("Mike");
        Lev l1 = new Lev("Кайя");
        Speakable2 s1 = new Pingvin("Улыбаемся и машем");
        Speakable2 s2 = new Lev("Король джунглей");

        Animal [] animals = {a1,a2,a3,f1,b1,m1, mechenosec,p1,l1};
        Speakable2 [] sp1 = {s1,s2,b1,m1,p1,l1};
        for (Animal a: animals) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if(a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.fly();
                p.speak();
            } else if(a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.sleep();
                l.run();
                l.speak();
            }
            System.out.println("=============================================");
        }
        for (Speakable2 s: sp1) {
            if (s instanceof Pingvin) {
                Pingvin pingvin = (Pingvin) s;
                System.out.println(pingvin.name);
                pingvin.eat();
                pingvin.sleep();
                pingvin.fly();
                pingvin.speak();
            } else if (s instanceof Lev) {
                Lev lev = (Lev) s;
                System.out.println(lev.name);
                lev.eat();
                lev.sleep();
                lev.run();
                lev.speak();
            }
            System.out.println("==================================================");
        }

    }
}

abstract class Animal {
    String name;
    public Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
abstract class Fish extends Animal {
    public Fish(String name) {
        super(name);
    }

    void sleep() {
        System.out.println("Всегда интересно наблюдать, как спят рыбы");
    }
    abstract void swim();
}

abstract class Bird extends Animal implements Speakable2 {

    public Bird(String name) {
        super(name);
    }
    abstract void fly();
    public void speak() {
        System.out.println(name + " sing");
    }
}

abstract class Mammal extends Animal implements Speakable2 {

    public Mammal(String name) {
        super(name);
    }
    abstract void run();
}


class Mechenosec extends Fish {
    public Mechenosec(String name) {
        super(name);
    }
    void eat() {
        System.out.println("Меченосец не хищная рыба и она есть обычный рыбий корм");
    }


    void swim() {
        System.out.println("Меченосец красивая рыба, которая умеет быстро плавать");
    }
}

class Pingvin extends Bird {

    public Pingvin(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }
    public void fly() {
        System.out.println("Пингвины не умеют летать");
    }
    public void speak() {
        System.out.println("Пингвины не умеют петь как соловьи");
    }
}

class Lev extends Mammal {

    public Lev(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Лев как и любой хищник любит мясо");
    }
    public void sleep() {
        System.out.println("Большую часть дня, лев спит");
    }
    public void run() {
        System.out.println("Лев - это не самая быстрая кошка");
    }
}
