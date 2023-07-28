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
        int value = console.nextInt();
        console.nextLine();
        switch (value) {
            case 1 -> bookshelf.add(inputAdd());
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
        System.out.print("Введите автора книги: ");
        String author = console.nextLine();
        System.out.print("Введите название книги: ");
        String title = inputTitle();
        System.out.print("Введите год издания книги: ");
        int publicationYear = console.nextInt();
        return new Book(author, title, publicationYear);
    }

    private static void inputFind() {
        Book book = bookshelf.find(inputTitle());
        System.out.println(book != null ? book : "Книга не найдена");
    }

    private static void inputRemove() {
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

    public static void printAllBooks() {
        System.out.println("В шкафу книг - " + bookshelf.getQuantityBooks() +  " свободно полок - " +
                (bookshelf.getMaxBook()  - bookshelf.getQuantityBooks()));
        for (int i = 0; i < bookshelf.getQuantityBooks(); i++) {
            System.out.println("|" + bookshelf.getBooks()[i] + "|");
            System.out.println("|" + "-".repeat(bookshelf.getMaxLength()) + "|");
        }
    }
}
