package patterns.dependency_injection.example2.bestPractice;

public class DiTest {
    public static void main(String[] args) {
        MyDependency myDependency = new MyDependency();
        MyClass myClass = new MyClass(myDependency);
        myClass.doSomethingElse();
    }
}
