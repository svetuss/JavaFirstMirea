package ru.mirea.task26;

public class StandartTurnStrategy implements TurnStrategy {
    @Override
    public void turn() {
        System.out.println("Поворот, как обычно, 4 раза!");
    }
}
