package ru.mirea.task5.dish;

public class TestDish {
    public static void main(String[] args){
        Cup cup = new Cup("Форфор","Белый","Округлая");
        Griddle griddle = new Griddle("Алюминий","Серый","Конусообразная");
        cup.displayInfo();
        griddle.displayInfo();
    }
}
