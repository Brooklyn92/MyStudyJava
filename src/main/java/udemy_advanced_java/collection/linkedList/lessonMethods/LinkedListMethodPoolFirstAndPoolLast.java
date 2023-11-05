package udemy_advanced_java.collection.linkedList.lessonMethods;

import udemy_advanced_java.collection.linkedList.example1.Student2;

import java.util.LinkedList;

public class LinkedListMethodPoolFirstAndPoolLast {
    public static void main(String[] args) {
        Student2 st1 = new Student2("Иван", 3);
        Student2 st2 = new Student2("Николай",2);
        Student2 st3 = new Student2("Елена",1);
        Student2 st4 = new Student2("Петр",4);
        Student2 st5 = new Student2("Мария",3);

        LinkedList<Student2> linkedList = new LinkedList<>();
        linkedList.add(st1);
        linkedList.add(st2);
        linkedList.add(st3);
        linkedList.add(st4);
        linkedList.add(st5);
        System.out.println("linkedList до вызова метода pollFirst(): " + linkedList); // => [Student2{name='Иван', course=3}, Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}]
        linkedList.pollFirst(); // => метод возвращает первый элемент списка и сразу же удаляет его из списка.
        System.out.println("linkedList после вызова метода pollFirst(): " + linkedList); // => [Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}, Student2{name='Мария', course=3}]
        linkedList.pollLast(); // => метод возвращает последний элемент списка и сразу же удаляет его из списка
        System.out.println("linkedList после вызова метода pollLast(): " + linkedList); // => linkedList после вызова метода pollLast(): [Student2{name='Николай', course=2}, Student2{name='Елена', course=1}, Student2{name='Петр', course=4}]

    }

}
