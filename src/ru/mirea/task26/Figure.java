package ru.mirea.task26;

public class Figure {
    TurnStrategy turnStrategy;
    public void turn() {
        turnStrategy.turn();
    }
    public void left() {
        System.out.println("Фигура тетриса может двигаться на единицу влево.");
    }
    public void right() {
        System.out.println("Фигура тетриса может двигаться на единицу влево.");
    }
}
