package ru.mirea.task8.opt1;

import java.awt.*;
import java.util.Random;

public class Triangle extends Shape{
    public Triangle () {
        this.type = "Triangle";
    }
    public void paintComponent(Graphics g) {
        Random rand = new Random();
        int [] x = {100,150,50};
        int [] y = {10,100,100};
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
        g.setColor(new Color(this.r,this.g,this.b));
        g.fillPolygon(x, y, 3);
    }
}
