package ru.mirea.task5.dog;

import ru.mirea.task5.dog.Breeds;

public class TestDog {
    public static void main(String[] args) {
        Breeds d1 = new Breeds("Бобик",10, "Мопс" );
        System.out.println(d1.getBreeds());
        System.out.println(d1.toString());
    }
}
