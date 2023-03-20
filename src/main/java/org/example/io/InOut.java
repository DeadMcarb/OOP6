package org.example.io;


import org.example.data.Book;
import org.example.data.BookList;

public interface InOut {
    public Book[] readObjects(String filePath);
    public void writeObjects(BookList books, String filePath);
}
