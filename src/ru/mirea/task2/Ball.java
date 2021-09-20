package ru.mirea.task2;

public class Ball {
    private String color;
    private int weight;

    public Ball(String c, int w) {
        color = c;
        weight = w;
    }
    public Ball(String c) {
        color = c;
        weight = 0;
    }
    public Ball() {
        color = "Pink";
        weight = 0;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(String color){
        return color;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return this.color+", weight "+this.weight;
    }

    public void intoConsol() {
        System.out.println("The "+color+" ball weights "+weight+" g");
    }
}
