package ru.mirea.task5.furniture;

public abstract class Furniture {
    private String material, color;
    private int price;

    public Furniture(String material, String color, int price)
    {
        this.material = material;
        this.color = color;
        this.price = price;
    }

    public int getPrice(){
        return this.price;
    }
    public String getMaterial(){
        return this.material;
    }
    public String getMColor(){
        return this.color;
    }

    public void displayInfo(){
        System.out.println("Материал: "+material+". Цвет: "+color+"; Цена: "+price+" руб.");
    }
}
