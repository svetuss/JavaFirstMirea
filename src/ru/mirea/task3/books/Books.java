package ru.mirea.task3.books;

public class Books {
    private int year;
    private String author, name;

    public Books(int year, String author, String name){
        this.year = year;
        this.author = author;
        this.name = name;
    }

    public void setYear(int year){
        this.year = year;
    }
    public int getYear(){
        return year;
    }

    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void intoConsol(){
        System.out.println("Книга автора " + author + " с названием " + name + " издана в " + year + " году.");
    }
}
