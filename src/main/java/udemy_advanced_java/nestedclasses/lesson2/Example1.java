package udemy_advanced_java.nestedclasses.lesson2;

public class Example1 {
    public static void main(String[] args) {
        Car.Engine e = new Car.Engine(256);
        System.out.println(e); // => My engine: {horsePower=256}
        Car car = new Car("red", 2, e);
        System.out.println(car); // => My car: {color='red', doorCount=2, engine=My engine: {horsePower=256}}
    }
}
