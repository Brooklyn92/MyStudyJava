package udemy.lesson25_polimorfizm;

public class PolimorfizmTest {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
//        emp1.work(); // -> Teacher works
//        emp2.work(); // -> Driver works
//        emp3.work(); // -> Doctor works
//        Help_able h = new Driver();
//        h.help(); // -> Driver sleep
        Employee [] array1 = {emp1, emp2, emp3};
        for(Employee employees: array1) {
          employees.work(); // ->  Teacher works, Driver works, Doctor works
        }

    }
}

abstract class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
        abstract void work();
    }


class Teacher extends Employee {
    @Override
    void  work() {
        System.out.println("Teacher works");
    }
}

class Driver extends Employee implements Help_able {

    @Override
    public void help() {
        System.out.println("Driver sleep");
    }

    @Override
    void  work() {
        System.out.println("Driver works");
    }
}

class Doctor extends Employee {
    @Override
    void  work() {
        System.out.println("Doctor works");
    }
}

interface Help_able {
    void help();
}
