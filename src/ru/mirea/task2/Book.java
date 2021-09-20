package ru.mirea.task2;

public class Book {
    private String author;
    private int pages;

    public Book(String au, int p) {
        author = au;
        pages = p;
    }
    public Book(String au) {
        author = au;
        pages = 0;
    }
    public Book() {
        author = "Gogol";
        pages = 0;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(String author){
        return author;
    }

    public int getPages() {
        return pages;
    }

    public String toString() {
        return this.author+", "+this.pages+" pages";
    }

    public void intoPages() {
        System.out.println("There are "+pages+" pages in one book by "+author);
    }
}