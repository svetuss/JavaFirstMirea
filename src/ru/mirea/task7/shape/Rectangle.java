package ru.mirea.task7.shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        width = 1;
        length = 1;
        color = "Black";
        filled = false;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
        color = "Orange";
        filled = false;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    @Override
    public double getArea(){
        return (width*length);
    }
    @Override
    public double getPerimeter(){
        return 2*(width+length);
    }
    @Override
    public String toString(){
        return("Rectangle. "+"Width: "+width+", length: "+length+", color: "+color+", filled: "+filled);
    }
}
