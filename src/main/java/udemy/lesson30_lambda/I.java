package udemy.lesson30_lambda;

public interface I {
    void abc();
    default void def1(){}
    default void def2(){}
    default void def3(){}
    //Данный интерфейс всё равно считается функциональным!!!!!!!. Т.к. он имеет минимум одни абстрактный метод, в данном случае это метод abc().
}
