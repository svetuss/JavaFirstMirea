package ru.mirea.task16.company;

import java.awt.*;

class Block {
    int ARC_RADIUS = 5;
    int BLOCK_SIZE = 27;
    private int x, y;

    public Block(int x, int y) {
        setX(x);
        setY(y);
    }

    public Block() {}

    void setX(int x) { this.x = x; }
    void setY(int y) { this.y = y; }

    int getX() { return x; }
    int getY() { return y; }

    int getBlockSize() {
        return BLOCK_SIZE;
    }

    void paint(Graphics g, int color) {
        g.setColor(new Color(color));
        g.drawRoundRect(x*BLOCK_SIZE+1, y*BLOCK_SIZE+1, BLOCK_SIZE-2, BLOCK_SIZE-2, ARC_RADIUS, ARC_RADIUS);
    }
}