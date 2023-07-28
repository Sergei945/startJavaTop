package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int quantityBooks;
    private Book[] books = new Book[10];
    private int maxLength;

    public void clear() {
        Arrays.fill(books,0, quantityBooks, null);
        quantityBooks = 0;
        System.out.println("Шкаф снова чист");
    }

    public void addBook(String author, String title, int year) {
        books[quantityBooks] = new Book(author, title, year);
        if(maxLength < books[quantityBooks].getLengthInfo()) {
            maxLength = books[quantityBooks].getLengthInfo();
        }
        System.out.println();
        System.out.println("Книга " + books[quantityBooks] + " добавлена в шкаф");
        quantityBooks++;
    }

    public boolean findBook(String title) {
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                System.out.println("Книга которую вы искали - " + books[i].toString());
                return true;
            }
        }
        return false;
    }

    public void removeBook(String title) {
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                int length = books[i].getLengthInfo();
                System.out.println("\nКнига " + books[i] + " удалена");
                System.arraycopy(books, i + 1, books, i, quantityBooks - i);
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

    public void printAllBooks() {
        System.out.println("В шкафу книг - " + quantityBooks +  " свободно полок - " + (books.length  - quantityBooks));
        for (int i = 0; i < quantityBooks; i++) {
                System.out.println("|" + books[i] + "|");
                System.out.println("|" + "-".repeat(maxLength) + "|");
        }
    }
}


