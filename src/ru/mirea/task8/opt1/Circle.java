package ru.mirea.task8.opt1;

import java.awt.*;

public class Circle extends Shape{
    public Circle () {
        this.type = "Circle";
    }
    public void paintComponent(Graphics g) {
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
        g.setColor(new Color(this.r,this.g,this.b));
        g.fillOval(50,10,100,100);
    }
}