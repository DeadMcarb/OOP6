package org.example;

import org.example.data.BookList;
import org.example.io.IO;
import org.example.processor.Processor;

import java.io.Serializable;
import java.util.Scanner;

public class Main implements Serializable {

    public static void main(String[] args) {
        new Main().run();
    }

    private void menu() {
        System.out.println("""
                [0] Read file
                [1] Show all list
                [2] Filter by author and sorted by years
                [3] Show author list sorted by alphabet
                [4] show books after year
                [5] Filter by publisher
                [6] Add new book
                [7] Delete book by Id
                [8] Save
                [9] Add some book to Array
                [10] Exit
                """);

        System.out.print(">> ");
    }

    private void run() {
        BookList books = new BookList();
        IO io = new IO();
        Processor processor = new Processor();

        loop:
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            int m = scanner.nextInt();
            switch (m) {

                case 0 -> books.setBooksList(io.readObjects(books));
                case 1 -> System.out.println(books);

                case 2 -> {
                    System.out.print("Enter name of author >> ");
                    String author = scanner.nextLine();
                    books.showByAuthorSortedByYears(author);
                }

                case 3 -> books.showAuthorListSortedByAlphabet();

                case 4 -> {
                    System.out.print("Enter a year >> ");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    books.showBooksAfterYear(year);
                }

                case 5 -> {
                    System.out.print("Enter name of publisher >> ");
                    String publisher = scanner.nextLine();
                    books.showBooksByPublisher(publisher);
                }

                case 6 -> processor.addNewBook(books, scanner);

                case 7 -> {
                    System.out.print("Enter id to delete >> ");
                    int id = scanner.nextInt();
                    books.deleteById(id);
                }

                case 8 -> io.writeObjects(books);
                case 9 -> processor.createBooksArray(books);
                case 10 -> {
                    break loop;
                }
            }
        }
    }
}