package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Bookshelf bookshelf = new Bookshelf();
    private static Scanner console = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        while (isInputMenu()) {
            pressEnter();
            printBookShelf();
        }
    }

    private static boolean isInputMenu() {
        printMenu();
        System.out.print("Выберите цифрой требуемое действие. ");
        int item = console.nextInt();
        console.nextLine();
        switch (item) {
            case 1 -> addBook();
            case 2 -> findBook();
            case 3 -> removeBook();
            case 4 -> bookshelf.clear();
            case 5 -> {
                return false;
            }
            default -> System.out.println("Неверные значения");
        }
        return true;
    }

    private static void printMenu() {
        if(bookshelf.getQuantityBooks() == 0) {
            System.out.println("\nШкаф пуст. Вы можете добавить в него первую книгу\n");
        }
        System.out.println("""         
                    menu:
                    1. save
                    2. find
                    3. delete
                    4. clear
                    5. quit
                    """);
    }

    private static void addBook() {
        System.out.print("Введите автора книги: ");
        String author = console.nextLine();
        String title = inputTitle();
        System.out.print("Введите год издания книги: ");
        int publicationYear = console.nextInt();
        bookshelf.add(new Book(author, title, publicationYear));
        console.nextLine();
    }

    private static void findBook() {
        Book book = bookshelf.find(inputTitle());
        System.out.println(book != null ? book : "Книга не найдена");
    }

    private static void removeBook() {
        bookshelf.remove(inputTitle());
    }

    private static String inputTitle() {
        System.out.print("Введите название книги: ");
        return console.nextLine();
    }

    private static void pressEnter() {
        System.out.print("\nДля продолжения работы нажмите клавишу <Enter>");
        String key;
        do {
            key = console.nextLine();
        } while (!key.equals(""));
    }

    public static void printBookShelf() {
        System.out.println("В шкафу книг - " + bookshelf.getQuantityBooks() +  " свободно полок - " +
                (bookshelf.getCAPACITY()  - bookshelf.getQuantityBooks()));
        int maxLength = bookshelf.getMaxLength();
        for (Book book: bookshelf.getBooks()) {
            System.out.println("|" + book + " ".repeat(maxLength - book.getLengthInfo()) + "|");
            System.out.println("|" + "-".repeat(maxLength) + "|");
        }
    }
}
