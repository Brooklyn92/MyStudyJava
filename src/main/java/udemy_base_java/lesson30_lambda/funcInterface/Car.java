package udemy_base_java.lesson30_lambda.funcInterface;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Car {
    String model;
    String color;
    Double engine;

    public Car(String model, String color, Double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public String toString() {
        return "Ваша машина: " + model + ", цвет " + color + " и объём двигателя " + engine;
    }
}

class TestCar {

    public static ArrayList<Car> createThreeCar(Supplier<Car> carSupplier) {
        ArrayList<Car> a1 = new ArrayList<>();
        for (int i = 0; i<3; i++) {
            a1.add(carSupplier.get());
        }
        return a1;
    }

    //------Первый вариант использования функционального интерефейса Consumer-----
    public static void changeCar(Car car, Consumer<Car> carConsumer) {
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        //---Создание автомобиля
        ArrayList<Car> ourCar = createThreeCar(() -> new Car("Nissan Juke", "Black", 2.0));
        System.out.println(ourCar);

        //------Первый вариант использования функционального интерефейса Consumer-----
        changeCar(ourCar.get(0),car -> {
            car.color = "Red";
            car.engine = 2.4;
            System.out.println("Изменённая машина " + car);});
        System.out.println(ourCar);


//------Второй вариант использования функционального интерефейса Consumer-----
//        Consumer<Car> carConsumer = car -> {
//            car.color = "Red";
//            car.engine = 2.4;
//            System.out.println("Изменённая машина " + car);};
//            carConsumer.accept(ourCar.get(0));
//        System.out.println("Ваша машина " + ourCar);
    }
}
