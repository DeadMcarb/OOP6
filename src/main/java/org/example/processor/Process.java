package org.example.processor;

import org.example.data.BookList;

import java.util.Scanner;

public interface Process {
//    public void showBooksByName(BookList books, Scanner scanner);
//    public void showBookByPrice(BookList books, Scanner scanner);
    public void addNewBook(BookList books, Scanner scanner);
//    public void deleteBookById(BookList books, Scanner scanner);
//    public void showBooks(BookList books);
//    public void showBooksByTerm(BookList books, Scanner scanner);
    public void createBooksArray(BookList books);
}
