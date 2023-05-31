package udemy_advanced_java.nestedclasses.lesson2;


public class Car {
    String color;
    int doorCount;
    Engine engine;
    private static int a;

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method() {
        System.out.println(Engine.countOfObject);
        Engine engine = new Engine(200);
        System.out.println(engine.horsePower); // => обращение к private полю внутреннего класса
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    public static class Engine {
        private int horsePower;
        static int countOfObject;

        public Engine(int horsePower) {
            System.out.println(a);
//            System.out.println(doorCount); // => Non-static field 'doorCount' cannot be referenced from a static context
            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
