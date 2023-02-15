package patterns.iterator.example2;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf {
    ArrayList<Book> books = new ArrayList<>();

    void addBook(String name) {
        books.add(new Book("---", name, "unknown"));
    }

    void addBook(String name, String author) {
        books.add(new Book("---", name, author));
    }


    Iterator<Book> createIterator() {
//        return new BookShelfIterator(books); // ->  первый вариант вызова итератора созданный нами самостоятельно
        return books.iterator(); // -> второй вариант вызова итератора через метод коллекции.
    }
}
