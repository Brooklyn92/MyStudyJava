package patterns.dependency_injection.example2.hardDependence;

public class MyClass {
    private MyDependency myDependency;

    public MyClass() {
        myDependency = new MyDependency();
    }

    public void doSomethingElse() {
        System.out.println("MyClass is doing something else");
        myDependency.doSomething();
    }
}
