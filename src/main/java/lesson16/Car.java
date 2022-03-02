package lesson16;

public class Car {
    String color;
    String engine;

    public Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final int a = 5;

    public Car abc(String cvet) {
        Car c10 = new Car(cvet, "V4");
        return c10;
    }

    public static void main(String[] args) {
        Car c = new Car("red", "V6");
        Car c2 = c.abc("Black");
        System.out.println(c.color);
    }

}