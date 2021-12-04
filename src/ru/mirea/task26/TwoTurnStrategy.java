package ru.mirea.task26;

public class TwoTurnStrategy implements TurnStrategy {
    @Override
    public void turn() {
        System.out.println("фигура может поворачиваться два раза!");
    }
}
