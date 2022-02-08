package lesson7.pac1;

import lesson7.pac2.pac3.Package2;

public class Package1 {
    public static void main(String[] args) {
        Package2 package2 = new Package2(); //создание объекта другого пакета через import
        lesson7.pac2.pac3.Package3 package3 = new lesson7.pac2.pac3.Package3(); // создание объекта другого пакета через абсалютный путь по пакетам
    }
}
