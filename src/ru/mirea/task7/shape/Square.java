package ru.mirea.task7.shape;

import ru.mirea.task7.shape.Rectangle;

public class Square extends Rectangle {
    public Square(){
        width = 1;
        length = 1;
        color = "Brown";
        filled = false;
    }
    public Square(double side){
        this.width = side;
        this.length = side;
        color = "White";
        filled = false;
    }
    public Square(double side, String color, boolean filled){
        this.width = side;
        this.length = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide(){
        return width;
    }
    public void setSide(double side){
        this.width = side;
        this.length = side;
    }
    @Override
    public void setWidth(double side){
        width = side;
        length = side;
    }
    @Override
    public void setLength(double side){
        this.width = side;
        this.length = side;
    }
    @Override
    public String toString(){
        return("Square. "+"Width: "+width+", length: "+length+", color: "+color+", filled: "+filled);
    }
}
