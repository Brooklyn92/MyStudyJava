package patterns.builder.example1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    static List<Window> windows = new ArrayList<Window>();
    public static void main(String[] args) {
//        Supplier s = new Supplier();
//        s.createWindow().open();
        Supplier[] creators = new Supplier[] {new Supplier(), new CompanyA(), new CompanyB()};
        for (Supplier c:creators)
            c.install().open();

        System.out.println("=================================");

        System.out.println("Установленные окна:");
        for (Window w: windows)
            System.out.println(w);

    }
}
