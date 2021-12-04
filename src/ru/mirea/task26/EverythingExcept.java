package ru.mirea.task26;

public class EverythingExcept extends Figure {
    public EverythingExcept() {
        this.turnStrategy = new StandartTurnStrategy();
    }
}
