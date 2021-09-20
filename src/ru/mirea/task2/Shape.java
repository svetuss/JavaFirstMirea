package ru.mirea.task2;

public class Shape {
    private String type;
    private int square;

    public Shape(String ty, int sq){
        type = ty;
        square = sq;
    }
    public Shape(String ty){
        type = ty;
        square = 0;
    }
    public Shape() {
        type = "Rectangle";
        square = 0;
    }
    public String toString(){
        return this.type +", S = "+ this.square +" m2";
    }
}
