package udemy_advanced_java.interface_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample1 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Иван", "Петров", 6542);
        Employee emp2 = new Employee(100, "Заур", "Трегулов", 12345);
        Employee emp3 = new Employee(100, "Иван", "Сидоров", 8542);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Перед сортировкой " + list); // => Перед сортировкой [Employee{id=100, name='Иван', surname='Петров', salary=6542}, Employee{id=100, name='Заур', surname='Трегулов', salary=12345}, Employee{id=100, name='Иван', surname='Сидоров', salary=8542}]
//        Collections.sort(list);
//        System.out.println("После сортировки " + list); // => После сортировки [Заур, Иван, Мария]
    }
}