package udemy_advanced_java.comparatorAndComparable.lesson2_interface_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestInterfaceComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(100, "Alex", "Brooklyn", 25000);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 30000);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 8000);
        Employee employee4 = new Employee(66, "Ceed", "Dedov", 1000);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        System.out.println("До сортировки: " + employees); // => До сортировки: [Employee{id=100, name='Alex', surname='Brooklyn', salary=25000}, Employee{id=15, name='Ivan', surname='Petrov', salary=30000}, Employee{id=123, name='Ivan', surname='Sidorov', salary=8532}]
        Collections.sort(employees); //=> класс с сортировкой по id с помощью интерфейса Comparable

//        Collections.sort(employees, new IdComparator()); //=> класс с сортировкой по id с помощью интерфейса Comparator
//        Collections.sort(employees, new NameComparator()); //=> класс с сортировкой по name с помощью интерфейса Comparator
//        Collections.sort(employees, new SalaryComparator()); //=> класс с сортировкой по salary с помощью интерфейса Comparator
        System.out.println("Наша созданная сортировка: " + employees); // => Наша созданная сортировка: [Employee{id=15, name='Ivan', surname='Petrov', salary=30000}, Employee{id=100, name='Alex', surname='Brooklyn', salary=25000}, Employee{id=123, name='Ivan', surname='Sidorov', salary=8532}]

    }
}
