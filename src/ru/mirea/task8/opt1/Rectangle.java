package ru.mirea.task8.opt1;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle () {
        this.type = "Rectangle";
    }
    public void paintComponent(Graphics g) {
        this.r = (int) (Math.random() * 255);
        this.g = (int) (Math.random() * 255);
        this.b = (int) (Math.random() * 255);
        g.setColor(new Color(this.r,this.g,this.b));
        g.fillRect(50,35,100,50);
    }
}