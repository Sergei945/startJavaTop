package com.startjava.graduation.bookshelf;

public class Book {
    private String author;
    private String title;
    private int publicationYear;
    private int lengthInfo;

    public Book(String author, String name, int publicationYear) {
        this.author = author;
        this.title = name;
        this.publicationYear = publicationYear;
        lengthInfo = toString().length();
    }

    public String getTitle() {
        return title;
    }

    public int getLengthInfo() {
        return lengthInfo;
    }

    @Override
    public String toString() {
        return author + "," + title + "," + publicationYear;
    }
}

