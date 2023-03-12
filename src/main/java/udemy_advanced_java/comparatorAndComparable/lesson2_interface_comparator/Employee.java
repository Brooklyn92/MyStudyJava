package udemy_advanced_java.comparatorAndComparable.lesson2_interface_comparator;

public class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
////===============================================================================
        //Первый вариант написания сортировки от меньшего к большему
       if (this.id == anotherEmp.id) {
           return 0;
       }
       else if (this.id < anotherEmp.id) {
           return -1;
       }
       else {
           return 1;
       }
//===============================================================================
       //Второй вариант написания сортировки от меньшего к большему
//        return this.id-anotherEmp.id;
//===============================================================================
        //Третий вариант написания сортировки от меньшего к большему. Для этого необходимо поле id привести к тиму данных Integer
//        return id.compareTo(anotherEmp.id);
//===============================================================================
        //Сортировка по имени по алфавиту
//        return this.name.compareTo(anotherEmp.name);
//===============================================================================
        //Написание сортировки в случае, если имена одинаковые, а фамилии разные. Т.е. сначала будут сравниваться имена, и если они одинаковые, то после сравниваются фамилии
//        int res = this.name.compareTo(anotherEmp.name);
//        if (res==0) {
//            res =  this.surname.compareTo(anotherEmp.surname);
//        }
//        return res;
    }
}
