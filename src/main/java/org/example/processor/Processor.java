package org.example.processor;

import org.example.data.Book;
import org.example.data.BookList;

import java.util.Scanner;

public class Processor implements Process {

    public void addNewBook(BookList books, Scanner scanner) {
        System.out.print("Enter id >> ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter name >> ");
        String name = scanner.nextLine();

        System.out.print("Enter author >> ");
        String author = scanner.nextLine();

        System.out.print("Enter price >> ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter year >> ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter publisher >> ");
        String publisher = scanner.nextLine();

        System.out.print("Enter number of pages >> ");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();

        books.addBook(new Book(id, name, author, price, year, publisher, numberOfPages));
    }





    public void createBooksArray(BookList books) {
        books.addBook(new Book(1, "Никогда, никогда", "Колин Гувер", 300, 2015, "Любовні романи", 800));
        books.addBook(new Book(2, "Скарби Валькірії: Правда і вигадка", "Сергій Алексєєв", 150, 2003, "Сучасна російська література", 1000));
        books.addBook(new Book(3, "Підручник Українська мова 5 клас", "Авраменко", 456, 2022, "УкрЛіб", 200));
        books.addBook(new Book(4, "Поцілунок вампіра. Книга 5. Клуб безсмертних" , "Колин Гувер", 78, 2010, "Любовні романи", 678));
        books.addBook(new Book(5, "Подорожі Тафа", "Джордж Мартін", 89, 1986, "Сучасна зарубіжна література", 567));
    }


}
