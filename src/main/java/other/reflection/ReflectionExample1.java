package other.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionExample1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        MyClass myClass = new MyClass(1, "hello");

        Class clazz = Class.forName(MyClass.class.getName());
        Class[] params = {int.class, String.class};
        myClass = (MyClass) clazz.getConstructor(params).newInstance(1, "default2");


        Constructor[] constructors = clazz.getConstructors();
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
    }
}
