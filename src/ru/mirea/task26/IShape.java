package ru.mirea.task26;

public class IShape extends Figure {
    public IShape() {
        this.turnStrategy = new TwoTurnStrategy();
    }
}
