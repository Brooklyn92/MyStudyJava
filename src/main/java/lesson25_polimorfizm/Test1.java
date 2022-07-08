package lesson25_polimorfizm;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        emp1.work();
        emp2.work();
        emp3.work();
        Help_able h = new Driver();
        h.help();

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
