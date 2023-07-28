package com.startjava.graduation.bookshelf;


import java.util.Scanner;

public class BookshelfTest {
    static Scanner console = new Scanner(System.in, "cp866");
    public static void main(String[] args) {

        Bookshelf bookshelf = new Bookshelf();
        System.out.println("Шкаф пуст. Вы можете добавить в него первую книгу");

        boolean exitApp = true;
        while (exitApp) {
            System.out.println("""         
                    menu:
                    1. save
                    2. find
                    3. delete
                    4. clear
                    5. quit
                    """);
            System.out.print("Выберите цифрой требуемое действие. ");
            switch (console.nextLine().charAt(0)) {
                case '1' -> {
                    System.out.print("Введите автора книги: ");
                    String author = console.nextLine();
                    System.out.print("Введите название книги: ");
                    String name = console.nextLine();
                    System.out.print("Введите год издания книги: ");
                    int year = console.nextInt();
                    bookshelf.addBook(author, name, year);
                }
                case '2' -> {
                    System.out.print("Введите название книги которую требуется найти: ");
                    bookshelf.findBook(console.nextLine());
                }
                case '3' -> {
                    System.out.print("Введите название книги которую требуется удалить: ");
                    bookshelf.removeBook(console.nextLine());
                }
                case '4' -> bookshelf.clear();
                case '5' -> {
                    exitApp = false;
                }
                default -> {
                    System.out.println("Неверные значения");
                }
            }
            console.nextLine();
            pressEnter();
            bookshelf.printAllBooks();
        }
    }

    private static void pressEnter() {
        System.out.print("\nДля продолжения работы нажмите клавишу <Enter>");
        String key;
        do {
            key = console.nextLine();
        } while (!key.equals(""));
    }
}
