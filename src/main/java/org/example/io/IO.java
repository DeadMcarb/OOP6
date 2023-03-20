package org.example.io;

import org.example.data.Book;
import org.example.data.BookList;

import java.io.*;

public class IO implements InOut{
    public Book[] readObjects(String filePath) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Book[] prods = (Book[]) ois.readObject();
            System.out.println("File read success!");
            return prods;
        } catch (IOException e) {
            System.out.println("File Read ERROR!");
        } catch (ClassNotFoundException e) {
            System.out.println("File Not Found!");
        }
        return new Book[0];
    }

    public void writeObjects(BookList books, String filePath) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(books.getBooks());
            System.out.println("File write success!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

/////////// НАДО ДОБАВИТЬ ЗАПИСЬ В ТХТ ФАЙЛ