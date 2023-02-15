package patterns.iterator.example2;

public class Book {
    String isdn;
    String name;
    String author;

    public Book(String isdn, String name, String author) {
        this.isdn = isdn;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isdn='" + isdn + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
