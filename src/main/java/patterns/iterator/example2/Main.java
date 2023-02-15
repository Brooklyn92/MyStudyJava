package patterns.iterator.example2;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
//        Book book = new Book("", "WORLD WAR", "Stiven");
//        System.out.println(book);

        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Master and Margarite");
        bookShelf.addBook("BMW");
        bookShelf.addBook("Mercedes", "Germany");
        bookShelf.addBook("FORD", "USA");

        Iterator<Book> iterator = bookShelf.createIterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println("Книга: " + book.name + ", " + book.author);
        }


    }
}
