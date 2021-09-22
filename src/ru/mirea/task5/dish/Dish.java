package ru.mirea.task5.dish;

public abstract class Dish {
    private String color;
    private String material;
    public Dish(String material, String color){
        this.material = material;
        this.color = color;
    }
    public String getMaterial(){
        return material;
    }
    public String getColor(){
        return color;
    }
    public abstract void displayInfo();
}
