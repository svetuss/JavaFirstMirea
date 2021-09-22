package ru.mirea.task6.priceable;

public class TestPriceable {
    public int getPrice(int price)
    {
        return price;
    }
    public static void main(String[] args)
    {
        PriceableFood f1 = new PriceableFood();
        PriceableHairbrush h1 = new PriceableHairbrush();
        System.out.println("Price food is "+f1.getPrice(300));
        System.out.println("Price hairbrush is "+f1.getPrice(150));
    }
}
