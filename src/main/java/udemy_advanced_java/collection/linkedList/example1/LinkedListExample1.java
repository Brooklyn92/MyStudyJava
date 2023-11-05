package udemy_advanced_java.collection.linkedList.example1;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Иван", 3);
        Student2 st2 = new Student2("Николай",2);
        Student2 st3 = new Student2("Елена",1);
        Student2 st4 = new Student2("Петр",4);
        Student2 st5 = new Student2("Мария",3);

        LinkedList<Student2> student2LinkedList = new LinkedList<>();
        student2LinkedList.add(st1);
        student2LinkedList.add(st2);
        student2LinkedList.add(st3);
        student2LinkedList.add(st4);
        student2LinkedList.add(st5);
        System.out.println("LinkedList: " + student2LinkedList); // => LinkedList: [Student2{name='Иван', course=3}, Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}]

        System.out.println(student2LinkedList.get(2)); // => Student2{name='Елена', course=1}

        Student2 st6 = new Student2("Заур",3);
        Student2 st7 = new Student2("Игорь",4);
        student2LinkedList.add(st6);
        System.out.println("LinkedList: " + student2LinkedList); // => LinkedList: [Student2{name='Иван', course=3}, Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}, Student2{name='Заур', course=3}]

        student2LinkedList.add(1, st7);
        System.out.println("LinkedList: " + student2LinkedList); // => LinkedList: [Student2{name='Иван', course=3}, Student2{name='Игорь', course=4}, Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}, Student2{name='Заур', course=3}]

        student2LinkedList.remove(3);
        System.out.println("LinkedList: " + student2LinkedList); // => LinkedList: [Student2{name='Иван', course=3}, Student2{name='Игорь', course=4}, Student2{name='Николай', course=2}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}, Student2{name='Заур', course=3}]
    }
}
