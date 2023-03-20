package org.example;

import org.example.data.BookList;
import org.example.io.IO;
import org.example.ui.BookListUI;

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

        BookListUI ui = new BookListUI(books);

        loop:
        while (true) {
            menu();
            Scanner scanner = new Scanner(System.in);
            ui.setScanner(scanner);

            int m = scanner.nextInt();
            scanner.nextLine();

            switch (m) {

                case 0 -> books.setBooksList(io.readObjects("students.dat"));
                case 1 -> System.out.println(books);

                case 2 -> ui.showByAuthorSortedByYears();

                case 3 -> ui.showAuthorListSortedByAlphabet();

                case 4 -> ui.showBooksAfterYear();

                case 5 -> ui.showBooksByPublisher();

                case 6 -> ui.addNewBook(books, scanner);

                case 7 -> ui.deleteById();

                case 8 -> io.writeObjects(books, "students.dat");

                case 9 -> ui.createSomeBooksArray(books);
                case 10 -> {
                    break loop;
                }
            }
        }
    }


}