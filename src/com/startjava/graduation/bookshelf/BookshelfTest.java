package com.startjava.graduation.bookshelf;

import java.util.Scanner;

public class BookshelfTest {

    static Bookshelf bookshelf = new Bookshelf();
    private static Scanner console = new Scanner(System.in, "cp866");

    public static void main(String[] args) {
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");
        while (isInputMenu()) {
            pressEnter();
            printAllBooks();
        }
    }

    private static void printMenu() {
        System.out.println("""         
                    menu:
                    1. save
                    2. find
                    3. delete
                    4. clear
                    5. quit
                    """);
    }

    private static boolean isInputMenu() {
        printMenu();
        System.out.print("Выберите цифрой требуемое действие. ");
        switch (console.nextInt()) {
            case 1 -> bookshelf.addBook(inputAdd());
            case 2 -> inputFind();
            case 3 -> inputRemove();
            case 4 -> bookshelf.clear();
            case 5 -> {
                return false;
            }
            default -> System.out.println("Неверные значения");
        }
        return true;
    }

    private static Book inputAdd() {
        console.nextLine();
        System.out.print("Введите автора книги: ");
        String author = console.nextLine();
        System.out.print("Введите название книги: ");
        String name = console.nextLine();
        System.out.print("Введите год издания книги: ");
        int publicationYear = console.nextInt();
        return new Book(author, name, publicationYear);
    }

    private static void inputFind() {
        System.out.print("Введите название книги которую требуется найти: ");
        bookshelf.findBook(console.nextLine());
    }

    private static void inputRemove() {
        System.out.print("Введите название книги которую требуется удалить: ");
        console.nextLine();
        bookshelf.removeBook(console.nextLine());
    }

    private static void pressEnter() {
        console.nextLine();
        System.out.print("\nДля продолжения работы нажмите клавишу <Enter>");
        String key;
        do {
            key = console.nextLine();
        } while (!key.equals(""));
    }

    public static void printAllBooks() {
        System.out.println("В шкафу книг - " + bookshelf.getQuantityBooks() +  " свободно полок - " +
                (bookshelf.getMaxBook()  - bookshelf.getQuantityBooks()));
        for (int i = 0; i < bookshelf.getQuantityBooks(); i++) {
            System.out.println("|" + bookshelf.getBooks()[i] + "|");
            System.out.println("|" + "-".repeat(bookshelf.getMaxLength()) + "|");
        }
    }
}
