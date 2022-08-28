package com.telran.project.hashMap.boxmap;

public class Book {

    private String name;
    private String Author;
    private int pagesCount;

    public Book(String name, String author, int pagesCount) {
        this.name = name;
        Author = author;
        this.pagesCount = pagesCount;
    }

    public char getAlphabetIndex() {
        return name.toLowerCase().charAt(0);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", Author='" + Author + '\'' +
                ", pagesCount=" + pagesCount +
                '}';
    }
}
