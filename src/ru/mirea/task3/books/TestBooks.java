package ru.mirea.task3.books;

import ru.mirea.task3.books.Books;

public class TestBooks {
    public static void main(String[] ars){
        Books boo = new Books(1836, "Гоголь", "Тарас Бульба" );
        boo.setYear(1835);
        boo.intoConsol();
    }
}
