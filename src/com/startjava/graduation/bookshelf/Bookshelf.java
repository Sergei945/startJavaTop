package com.startjava.graduation.bookshelf;

import java.util.Arrays;

public class Bookshelf {
    private int quantityBooks;
    private int maxBook = 10;

    private Book[] books = new Book[maxBook];

    private int maxLength;

    public int getQuantityBooks() {
        return quantityBooks;
    }

    public int getMaxBook() {
        return maxBook;
    }

    public Book[] getBooks() {
        return books;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public void addBook(Book book) {
        books[quantityBooks] = book;
        if(maxLength < books[quantityBooks].getLengthInfo()) {
            maxLength = books[quantityBooks].getLengthInfo();
        }
        System.out.println();
        System.out.println("Книга " + books[quantityBooks] + " добавлена в шкаф");
        quantityBooks++;
    }

    public void findBook(String title) {
        System.out.print("Введите название книги которую требуется найти: ");
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getTitle().equals(title)) {
                System.out.println("Книга которую вы искали - " + books[i].toString());
                return;
            }
            System.out.println("На полке нет такой книги");
        }

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

    public void clear() {
        Arrays.fill(books,0, quantityBooks, null);
        quantityBooks = 0;
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
    }






}


