package udemy_advanced_java.comparatorAndComparable.lesson1_interface_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestInterfaceComparable {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Employee employee1 = new Employee(100, "Alex", "Brooklyn", 25000);
        Employee employee2 = new Employee(15, "Ivan", "Petrov", 30000);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 8532);
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("До сортировки: " + employees); // => До сортировки: [Employee{id=100, name='Alex', surname='Brooklyn', salary=25000}, Employee{id=15, name='Ivan', surname='Petrov', salary=30000}, Employee{id=123, name='Ivan', surname='Sidorov', salary=8532}]
        Collections.sort(employees);
        System.out.println("Наша созданная сортировка: " + employees); // => Наша созданная сортировка: [Employee{id=15, name='Ivan', surname='Petrov', salary=30000}, Employee{id=100, name='Alex', surname='Brooklyn', salary=25000}, Employee{id=123, name='Ivan', surname='Sidorov', salary=8532}]

    }
}
