package org.example;

import java.util.ArrayList;
import java.util.List;

public class BookInfo {
    public static void main(String[] args) {
        Book book1 = new Book("Ночь", "Толстой");
        Book book2 = new Book("Дочь", "Чехов", 1945);
        Book book3 = new Book("Му-му", "Тургеньев", 1995);
        Book book4 = new Book("На дне", "Горький", 1968, 123);
        Book book5 = new Book("Холод", "Ершов", 1936, 250, 500);

        List<Book> books = new ArrayList<Book>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        for (Book book : books) {
            book.printInfo();
            System.out.println("Книга издана до 1950 года - " + (book.isClassic() ? "да" : "нет"));
            System.out.println();
        }
    }
}
