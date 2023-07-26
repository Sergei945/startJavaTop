package com.startjava.graduation.bookshelf;

import java.util.Arrays;
import java.util.Scanner;

public class Bookshelf {
    private int quantityBooks;
    private Book[] books = new Book[10];
    private int maxLength = 0;
    public void play() {
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        while (!isOperation()) {}
    }

    private boolean isOperation() {
        Scanner console = new Scanner(System.in);
        System.out.print("""         
                menu:
                1. save
                2. find
                3. delete
                4. clear
                5. quit
                Выберите цифрой требуемое действие. 
                """);

        switch (console.nextLine().charAt(0)) {
            case '1' -> {
                System.out.print("Введите автора книги: ");
                String author = console.nextLine();
                System.out.print("Введите название книги: ");
                String name = console.nextLine();
                System.out.print("Введите год издания книги: ");
                int year = console.nextInt();
                addBook(author, name, year);
            }
            case '2' -> {
                System.out.print("Введите название книги которую требуется найти: ");
                findBook(console.nextLine());
            }
            case '3' -> {
                System.out.print("Введите название книги которую требуется удалить: ");
                removeBook(console.nextLine());
            }
            case '4' -> clear();
            case '5' -> {
                return true;
            }
            default -> {
                System.out.println("Неверные значения");
                return false;
            }
        }

//        String a = "";
//        while (a != null){
//            System.out.print("Для продолжения нажмите Enter");
//            a = console.nextLine();
//            System.out.println(a);
//        }
        printAllBooks();
        return false;
    }

    public void clear() {
        Arrays.fill(books, null);
    }

    public void addBook(String author, String name, int year) {
        books[quantityBooks] = new Book(author, name, year);
        if(maxLength > books[quantityBooks].getLengthInfo()) {
            maxLength = books[quantityBooks].getLengthInfo();
        }
        quantityBooks++;
    }

    public void findBook(String name) {
        for (int i = 0; i < quantityBooks; i++) {
            if(books[i].getName().equals(name)) {
                System.out.println("Книга которую вы искали.");
                System.out.println(books[i].toString());
            }
        }
    }

    public void removeBook(String name) {
        int indexRemoveBook = 0;
        for (int i = 0; i < quantityBooks; i++) {
            if(name.equals(books[i].getName())) {
                indexRemoveBook = i;
            }
        }
        for (int i = indexRemoveBook + 1; i < quantityBooks; i++) {
            books[i - 1] = books[i];
        }
        quantityBooks--;
    }

    public void printAllBooks() {
        System.out.println("В шкафу книг - " + quantityBooks +  " свободно полок - " + (books.length  - quantityBooks));
        for (int i = 0; i < quantityBooks; i++) {
                System.out.println(books[i]);
                System.out.print('|' + "-".repeat(maxLength) + '|');
        }
    }
}


