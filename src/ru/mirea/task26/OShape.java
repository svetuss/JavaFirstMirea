package ru.mirea.task26;

public class OShape extends Figure {
    public OShape() {
        this.turnStrategy = new NoTurnStrategy();
    }
}
