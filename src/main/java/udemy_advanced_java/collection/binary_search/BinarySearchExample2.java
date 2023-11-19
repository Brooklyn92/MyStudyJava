package udemy_advanced_java.collection.binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchExample2 {
    public static void main(String[] args) {
        Employee employee1 = new Employee(100, "Заур", 12345);
        Employee employee2 = new Employee(15,"Иван", 6542);
        Employee employee3 = new Employee(123,"Петр", 8542);
        Employee employee4 = new Employee(15,"Мария", 5678);
        Employee employee5 = new Employee(182,"Николай", 125);
        Employee employee6 = new Employee(15,"Александр", 9874);
        Employee employee7 = new Employee(250,"Елена", 1579);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);
        employeeList.add(employee7);

        System.out.println(employeeList); // => [Employee{id=100, name='Заур', salary=12345}, Employee{id=15, name='Иван', salary=6542}, Employee{id=123, name='Петр', salary=8542}, Employee{id=15, name='Мария', salary=5678}, Employee{id=182, name='Николай', salary=125}, Employee{id=15, name='Александр', salary=9874}, Employee{id=250, name='Елена', salary=1579}]

        Collections.sort(employeeList);  // => сортируем массив список employeeList по возрастанию поля id и полю name

        System.out.println(employeeList); // => [Employee{id=15, name='Александр', salary=9874}, Employee{id=15, name='Иван', salary=6542}, Employee{id=15, name='Мария', salary=5678}, Employee{id=100, name='Заур', salary=12345}, Employee{id=123, name='Петр', salary=8542}, Employee{id=182, name='Николай', salary=125}, Employee{id=250, name='Елена', salary=1579}]

        int index2 = Collections.binarySearch(employeeList, new Employee(182,"Николай", 125));
        System.out.println(index2); // => 5

    }
}
