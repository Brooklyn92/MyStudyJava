package patterns.iterator.example2;

import java.util.ArrayList;
import java.util.Iterator;

public class BookShelfIterator implements Iterator<Book> {
    ArrayList<Book> books = new ArrayList<>();
    int position;

    public BookShelfIterator(ArrayList<Book> books) {
        this.books = books;
        position = 0;
    }

    @Override
    public boolean hasNext() {
       return position < books.size() && books.get(position) != null;
    }

    @Override
    public Book next() {
        Book book = books.get(position);
        position++;
        return book;
    }
}
