package org.example.io;


import org.example.data.Book;
import org.example.data.BookList;

public interface InOut {
    public Book[] readObjects(BookList products);
    public void writeObjects(BookList products);
}
