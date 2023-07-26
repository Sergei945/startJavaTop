package com.startjava.graduation.bookshelf;

import java.util.Objects;

public class Book {
    private String author;

    private String name = "";
    private int year;
    private int lengthInfo = toString().length();

    public Book() {

    }
    public Book(String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    @Override
    public String toString() {
        return """
                |%s, %s, %s|
                """.formatted(author, name, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(author, book.author) && Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, year);
    }
}
