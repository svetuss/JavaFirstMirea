package ru.mirea.task26;

public class NoTurnStrategy implements TurnStrategy {
    @Override
    public void turn() {
        System.out.println("фигура не поворачивается!");
    }
}
