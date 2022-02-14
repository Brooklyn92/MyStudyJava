package lesson11.hw;

public class Car {
    String color;
    String engine;
    int col_doors;

    public Car(String color, String engine, int col_doors) {
        this.color = color;
        this.engine = engine;
        this.col_doors = col_doors;
    }
}

class CarTest {
    public static void changeColDoors(Car door1) {
        door1.col_doors = 4;
    }

    public static void swap (Car col1, Car col2) {
        Car col3 = col1;
        col1 = col2;
        col2 = col3;
        System.out.println(col1.color);
        System.out.println(col2.color);
    }

    public static void main(String[] args) {
        Car car1 = new Car("red", "v3", 2);
        System.out.println(car1.col_doors);
        changeColDoors(car1);
        System.out.println(car1.col_doors);
    }
}
