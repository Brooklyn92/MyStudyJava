package patterns.dependency_injection.example2.bestPractice;

public class MyClass {
    private MyDependency myDependency;

    public MyClass(MyDependency myDependency) {
        this.myDependency = myDependency;
    }

    public void doSomethingElse() {
        System.out.println("MyClass is doing something else");
        myDependency.doSomething();
    }
}
