package org.example.data;

import java.util.*;

public class BookList {
    private int size = 0;
    private final int maxSize = 100;
    private Book[] books = new Book[10];

    public void addBook(Book book) {
        ensureCapacity(size + 1);
        books[size++] = book;
    }

    private void ensureCapacity(int newCapacity) {
        if (newCapacity <= books.length) return;
        Book[] newArray = new Book[books.length * 2];
        System.arraycopy(books, 0, newArray, 0, books.length);
        books = newArray;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }



    public void setBooksList(Book[] arr){
        books = arr;
        size = books.length;
    }




    public ArrayList<Book> showByAuthorSortedByYears(String author) {
        ArrayList<Book> authorList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            if (books[i] != null) {
                if (books[i].getAuthor().equals(author)) {
                authorList.add(books[i]);
            }}
        }

        authorList.sort((o1, o2) -> Integer.compare(o1.getYear(), o2.getYear()));

        return authorList;
    }

    public ArrayList<String> showAuthorListSortedByAlphabet() {
        ArrayList<String> authorList = new ArrayList<String>();

        for (int i = 0; i < size; i++) {
            authorList.add(books[i].getAuthor());
        }

        Collections.sort(authorList);

        return authorList;
    }


    public ArrayList<Book> showBooksAfterYear(int year) {
        ArrayList<Book> newArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (books[i].getYear() > year) {
                newArray.add(books[i]);
            }
        }
        return newArray;
    }


    public ArrayList<Book> showBooksByPublisher(String publisher) {
        ArrayList<Book> newArray = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (books[i].getPublisher().equals(publisher)) {
                newArray.add(books[i]);
            }
        }
        return newArray;
    }

    public void deleteById(int id){
        Book[] prods = new Book[books.length-1];
        int num = 0;

        for (int i = 0, k = 0; i < size; i++) {
            if (books[i].getId() != id) {
                prods[k] = books[i];
                k++;
            }else num++;
        }
        size -= num;
        books = Arrays.copyOf(prods, prods.length);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(books[i]).append(",\n");
        }
        return sb.toString();
    }
}
