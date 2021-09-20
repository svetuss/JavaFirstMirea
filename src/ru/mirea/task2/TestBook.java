package ru.mirea.task2;

public class TestBook {
    public static void main(String[] args) {
        Book bo1 = new Book("William Shakespeare", 252);
        Book bo2 = new Book("Jane Austen", 78);
        Book bo3 = new Book("Pushkin");
        bo3.setPages(109);
        System.out.println(bo2);
        bo1.intoPages();
        bo2.intoPages();
        bo3.intoPages();
    }
}