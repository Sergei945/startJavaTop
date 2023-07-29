package com.startjava.graduation.bookshelf;

import java.util.Arrays;

//import static java.util.Arrays.*;

public class Bookshelf {
    private int quantityBooks;
    private int CAPACITY = 10;
    private Book[] books = new Book[CAPACITY];
    private int maxLength;

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public Book[] getBooks() { return Arrays.copyOf(books, quantityBooks); }

    public int getMaxLength() {
        return maxLength;
    }

    public void add(Book book) {
        books[quantityBooks] = book;
        if(maxLength < books[quantityBooks].getLengthInfo()) {
            maxLength = books[quantityBooks].getLengthInfo();
        }
        System.out.println("\nКнига " + books[quantityBooks] + " добавлена в шкаф");
        quantityBooks++;
    }

    public Book find(String title) {
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                return books[i];
            }
        }
        return null;
    }

    public void remove(String title) {
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                int length = books[i].getLengthInfo();
                System.out.println("\nКнига " + books[i] + " удалена");
                System.arraycopy(books, i + 1, books, i, quantityBooks - 1 - i);
                quantityBooks--;
                books[quantityBooks] = null;
                if(length == maxLength) {
                    maxLength = 0;
                    for (int j = 0; j < quantityBooks; j++) {
                        if (books[j].getLengthInfo() > maxLength) {
                            maxLength = books[j].getLengthInfo();
                        }
                    }
                }
                return;
            }
        }
        System.out.println("На полке нет такой книги");
    }

    public void clear() {
        Arrays.fill(books, 0, quantityBooks, null);
        quantityBooks = 0;
    }
}


